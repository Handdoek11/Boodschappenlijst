package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3118k0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3009j0 f23480a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f23481b = new AtomicBoolean(false);

    public C3118k0(InterfaceC3009j0 interfaceC3009j0) {
        this.f23480a = interfaceC3009j0;
    }

    public final InterfaceC3880r0 a(Object... objArr) {
        Constructor zza;
        synchronized (this.f23481b) {
            if (!this.f23481b.get()) {
                try {
                    zza = this.f23480a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f23481b.set(true);
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating extension", e8);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (InterfaceC3880r0) zza.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }
}
