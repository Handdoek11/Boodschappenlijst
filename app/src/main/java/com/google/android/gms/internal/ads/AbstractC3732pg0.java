package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.pg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3732pg0 {
    public static InterfaceC3296lg0 a(InterfaceC3296lg0 interfaceC3296lg0) {
        return ((interfaceC3296lg0 instanceof C3623og0) || (interfaceC3296lg0 instanceof C3405mg0)) ? interfaceC3296lg0 : interfaceC3296lg0 instanceof Serializable ? new C3405mg0(interfaceC3296lg0) : new C3623og0(interfaceC3296lg0);
    }
}
