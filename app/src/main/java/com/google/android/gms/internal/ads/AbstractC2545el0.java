package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.el0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2545el0 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f21876a = new CopyOnWriteArrayList();

    public static InterfaceC2437dl0 a(String str) {
        Iterator it = f21876a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        androidx.appcompat.app.E.a(it.next());
        throw null;
    }
}
