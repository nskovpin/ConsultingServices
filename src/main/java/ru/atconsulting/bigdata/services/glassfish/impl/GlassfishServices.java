package ru.atconsulting.bigdata.services.glassfish.impl;

import ru.atconsulting.bigdata.services.ServicesNames;

/**
 * Created by NSkovpin on 20.06.2016.
 */
public enum GlassfishServices implements ServicesNames {

    SubscriberInfoBatchBindingPort {
        public String getServiceName() {
            return SubscriberInfoBatchBindingPort.name();
        }
    },
    SubscriberFTTBBindingPort {
        public String getServiceName() {
            return SubscriberFTTBBindingPort.name();
        }
    },
    SubscribeInfoBindingPort {
        public String getServiceName() {
            return SubscribeInfoBindingPort.name();
        }
    },
    SubscriberHistoryBindingPort {
        public String getServiceName() {
            return SubscriberHistoryBindingPort.name();
        }
    },
    SubscriberDebtBindingPort {
        public String getServiceName() {
            return SubscriberDebtBindingPort.name();
        }
    },
    SubscriberHierarchyBindingPort {
        public String getServiceName() {
            return SubscriberHierarchyBindingPort.name();
        }
    },
    SubscriberWithFilterBindingPort {
        public String getServiceName() {
            return SubscriberWithFilterBindingPort.name();
        }
    },

    SubscriberCoreBalance {
        public String getServiceName() {
            return SubscriberCoreBalance.name();
        }
    },

    SubscriberSOCs {
        public String getServiceName() {
            return SubscriberSOCs.name();
        }
    },

    SubscriberType {
        public String getServiceName() {
            return SubscriberType.name();
        }
    },

    CreateInteraction {
        public String getServiceName() {
            return CreateInteraction.name();
        }
    }

}
