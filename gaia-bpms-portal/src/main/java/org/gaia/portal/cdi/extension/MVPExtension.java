package org.gaia.portal.cdi.extension;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.InjectionException;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.enterprise.inject.spi.ProcessInjectionPoint;
import javax.enterprise.inject.spi.ProcessInjectionTarget;

import org.gaia.portal.cdi.annotation.MVPView;

/**
 * http://docs.jboss.org/cdi/spec/1.1.EDR1/html/spi.html
 * @author robal
 *
 */
public class MVPExtension implements Extension {


	void afterBeanDiscovery(@Observes AfterBeanDiscovery abd, BeanManager bm) {
		System.out.println("---------------   afterBeanDiscovery COMPLETE.");
	}
	
	public <T> void processInjectionTarget(
			final @Observes ProcessInjectionTarget<T> pit) {
		AnnotatedType<T> at = pit.getAnnotatedType();
		if (!at.isAnnotationPresent(MVPView.class)) {
			return;
		}

		System.out.println("---------------   Load MVP View2: "
				+ pit.getInjectionTarget().getClass().getCanonicalName());

		final InjectionTarget<T> it = pit.getInjectionTarget();
		InjectionTarget<T> wrapped = new InjectionTarget<T>() {
			@Override
			public void inject(T instance, CreationalContext<T> ctx) {
				it.inject(instance, ctx);
				System.out.println("---------------   Create MVP: "
						+ instance.getClass().getCanonicalName());
			}

			@Override
			public void postConstruct(T instance) {
				it.postConstruct(instance);
			}

			@Override
			public void preDestroy(T instance) {
				it.dispose(instance);
			}

			@Override
			public void dispose(T instance) {
				it.dispose(instance);
			}

			@Override
			public Set<InjectionPoint> getInjectionPoints() {
				return it.getInjectionPoints();
			}

			@Override
			public T produce(CreationalContext<T> ctx) {
				return it.produce(ctx);
			}
		};
		pit.setInjectionTarget(wrapped);

	}

}