package sourcelookup;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Björn Michael
 * @since 1.0
 */
public class Activator extends Plugin {

  // The shared instance
  private static Activator plugin;

  /**
   * Returns the shared instance
   * 
   * @return the shared instance
   */
  public static Activator getInstance() {
    return plugin;
  }

  @Override
  public void start(final BundleContext bundleContext) throws Exception {
    super.start(bundleContext);
    plugin = this;
  }

  @Override
  public void stop(final BundleContext bundleContext) throws Exception {
    plugin = null;
    super.stop(bundleContext);
  }

}
