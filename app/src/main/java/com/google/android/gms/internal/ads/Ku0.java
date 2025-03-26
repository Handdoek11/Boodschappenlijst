package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class Ku0 {
    static Eu0 a(Class cls) {
        String str;
        ClassLoader classLoader = Ku0.class.getClassLoader();
        if (cls.equals(Eu0.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(Ku0.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        androidx.appcompat.app.E.a(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (NoSuchMethodException e8) {
                        throw new IllegalStateException(e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalStateException(e9);
                    }
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(Ku0.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    androidx.appcompat.app.E.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e12) {
                    Logger.getLogger(AbstractC4740yu0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (Eu0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (Eu0) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }
}
