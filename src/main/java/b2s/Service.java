package b2s;

import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.hibernate.HibernateBundle;
import com.yammer.dropwizard.migrations.MigrationsBundle;

public class Service extends com.yammer.dropwizard.Service<Config> {
    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
        bootstrap.setName("boiler-plate");
        bootstrap.addBundle(new HibernateBundle<Config>() {
            public DatabaseConfiguration getDatabaseConfiguration(Config configuration) {
                return configuration.getDatabaseConfiguration();
            }
        });
        bootstrap.addBundle(new MigrationsBundle<Config>() {
            public DatabaseConfiguration getDatabaseConfiguration(Config configuration) {
                return configuration.getDatabaseConfiguration();
            }
        });
    }

    @Override
    public void run(Config configuration, Environment environment) throws Exception {
    }
}
