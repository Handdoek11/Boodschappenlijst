package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Ao0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f13656c = Logger.getLogger(Ao0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final Ao0 f13657d = new Ao0();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f13658a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f13659b = new ConcurrentHashMap();

    public static Ao0 c() {
        return f13657d;
    }

    private final synchronized Tk0 g(String str) {
        if (!this.f13658a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (Tk0) this.f13658a.get(str);
    }

    private final synchronized void h(Tk0 tk0, boolean z7, boolean z8) {
        try {
            String str = ((Ko0) tk0).f16633a;
            if (this.f13659b.containsKey(str) && !((Boolean) this.f13659b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            Tk0 tk02 = (Tk0) this.f13658a.get(str);
            if (tk02 != null && !tk02.getClass().equals(tk0.getClass())) {
                f13656c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, tk02.getClass().getName(), tk0.getClass().getName()));
            }
            this.f13658a.putIfAbsent(str, tk0);
            this.f13659b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Tk0 a(String str, Class cls) {
        Tk0 g8 = g(str);
        if (g8.zzb().equals(cls)) {
            return g8;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(g8.getClass()) + ", which only supports: " + g8.zzb().toString());
    }

    public final Tk0 b(String str) {
        return g(str);
    }

    public final synchronized void d(Tk0 tk0, boolean z7) {
        f(tk0, 1, true);
    }

    public final boolean e(String str) {
        return ((Boolean) this.f13659b.get(str)).booleanValue();
    }

    public final synchronized void f(Tk0 tk0, int i8, boolean z7) {
        if (!AbstractC4183to0.a(i8)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(tk0, false, true);
    }
}
