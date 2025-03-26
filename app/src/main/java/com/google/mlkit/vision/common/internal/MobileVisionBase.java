package com.google.mlkit.vision.common.internal;

import A3.C0368b;
import Z2.C0771j;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0926l;
import androidx.lifecycle.t;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC0926l {

    /* renamed from: t, reason: collision with root package name */
    private static final C0771j f33058t = new C0771j("MobileVisionBase", "");

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f33059o;

    /* renamed from: s, reason: collision with root package name */
    private final C0368b f33060s;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @t(AbstractC0922h.a.ON_DESTROY)
    public synchronized void close() {
        if (!this.f33059o.getAndSet(true)) {
            this.f33060s.a();
            throw null;
        }
    }
}
