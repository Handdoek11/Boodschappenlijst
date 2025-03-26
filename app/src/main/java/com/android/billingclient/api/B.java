package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import com.google.android.gms.internal.play_billing.InterfaceC5163o1;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
final class B implements InterfaceC5163o1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Consumer f12277a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f12278b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E f12279c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f12280d;

    B(E e8, int i8, Consumer consumer, Runnable runnable) {
        this.f12280d = i8;
        this.f12277a = consumer;
        this.f12278b = runnable;
        this.f12279c = e8;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5163o1
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f12279c.f1(114, 28, H.f12295G);
            AbstractC5103e1.k("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f12279c.f1(107, 28, H.f12295G);
            AbstractC5103e1.k("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f12278b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5163o1
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        E e8 = this.f12279c;
        if (!E.c1(intValue)) {
            this.f12278b.run();
        } else {
            this.f12277a.accept(e8.d1(this.f12280d, num.intValue()));
        }
    }
}
