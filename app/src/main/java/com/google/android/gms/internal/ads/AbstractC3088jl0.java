package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.jl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3088jl0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23345a = 0;

    static {
        Logger.getLogger(AbstractC3088jl0.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(Ik0.class);
        hashSet.add(Ok0.class);
        hashSet.add(InterfaceC3306ll0.class);
        hashSet.add(Qk0.class);
        hashSet.add(Pk0.class);
        hashSet.add(InterfaceC2654fl0.class);
        hashSet.add(InterfaceC2123ar0.class);
        hashSet.add(InterfaceC2872hl0.class);
        hashSet.add(InterfaceC2980il0.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    public static Class a(Class cls) {
        try {
            return C3096jp0.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object b(C3647os0 c3647os0, Class cls) {
        String g02 = c3647os0.g0();
        return Ao0.c().a(g02, cls).b(c3647os0.f0());
    }
}
