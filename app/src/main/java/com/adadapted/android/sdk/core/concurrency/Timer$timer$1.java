package com.adadapted.android.sdk.core.concurrency;

import I6.a;
import J6.s;
import x6.C6916E;

/* loaded from: classes.dex */
final class Timer$timer$1 extends s implements a {
    final /* synthetic */ a $timedBackgroundFunc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Timer$timer$1(a aVar) {
        super(0);
        this.$timedBackgroundFunc = aVar;
    }

    @Override // I6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m17invoke();
        return C6916E.f44463a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m17invoke() {
        this.$timedBackgroundFunc.invoke();
    }
}
