package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import a6.InterfaceC0830g;
import a6.InterfaceC0831h;
import android.view.View;
import android.view.ViewTreeObserver;
import c6.AbstractC1021a;
import java.util.concurrent.TimeUnit;
import q5.AbstractC6635a;
import v6.C6846b;

/* loaded from: classes2.dex */
public abstract class X2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34592a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final String f34593b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final f6.i f34594c = new f6.i() { // from class: com.headcode.ourgroceries.android.T2
        @Override // f6.i
        public final boolean test(Object obj) {
            return X2.j((CharSequence) obj);
        }
    };

    public static InterfaceC0831h f(final long j8) {
        return new InterfaceC0831h() { // from class: com.headcode.ourgroceries.android.S2
            @Override // a6.InterfaceC0831h
            public final InterfaceC0830g a(AbstractC0829f abstractC0829f) {
                return X2.h(j8, abstractC0829f);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0830g g(long j8, Boolean bool) {
        return bool.booleanValue() ? AbstractC0829f.s() : AbstractC0829f.J(j8, TimeUnit.MILLISECONDS, AbstractC1021a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0830g h(final long j8, AbstractC0829f abstractC0829f) {
        return abstractC0829f.n().m(new f6.g() { // from class: com.headcode.ourgroceries.android.U2
            @Override // f6.g
            public final Object apply(Object obj) {
                return X2.g(j8, (Boolean) obj);
            }
        }).C(Boolean.FALSE).n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(String str, String str2, Object obj) {
        if (str.equals(f34592a) || str2.equals(f34593b)) {
            AbstractC6635a.b(str2, "Rx tap: " + str + " = " + obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(C6846b c6846b) {
        c6846b.b(Boolean.TRUE);
    }

    public static f6.d l(final String str, final String str2) {
        return new f6.d() { // from class: com.headcode.ourgroceries.android.W2
            @Override // f6.d
            public final void accept(Object obj) {
                X2.i(str2, str, obj);
            }
        };
    }

    public static AbstractC0829f m(View view) {
        final C6846b O7 = C6846b.O();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.headcode.ourgroceries.android.V2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                X2.k(O7);
            }
        });
        return O7;
    }
}
