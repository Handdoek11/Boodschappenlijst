package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.play_billing.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5151m1 extends AbstractC5157n1 {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceFutureC5225z1 f29948o;

    protected AbstractC5151m1(InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        this.f29948o = interfaceFutureC5225z1;
    }

    @Override // com.google.android.gms.internal.play_billing.X
    protected final /* synthetic */ Object a() {
        return this.f29948o;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractFutureC5145l1
    protected final /* synthetic */ Future c() {
        return this.f29948o;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5157n1
    protected final InterfaceFutureC5225z1 h() {
        return this.f29948o;
    }
}
