package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final List f28788a = new ArrayList();

    protected A() {
    }

    final InterfaceC5013s a(String str) {
        if (!this.f28788a.contains(AbstractC5048w2.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC5013s b(String str, Z2 z22, List list);
}
