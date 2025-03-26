package com.headcode.ourgroceries.android;

import A3.InterfaceC0370d;
import A3.InterfaceC0372f;
import A3.InterfaceC0373g;
import a5.C0823a;
import android.content.Context;
import android.media.ToneGenerator;
import androidx.appcompat.app.AbstractActivityC0835d;
import c3.AbstractC0981c;
import c3.C0980b;
import c3.C0984f;
import c3.C0985g;
import c3.C0986h;
import c3.InterfaceC0979a;
import c3.InterfaceC0982d;
import c5.AbstractC1019c;
import c5.C1018b;
import c5.InterfaceC1017a;
import q5.AbstractC6635a;
import s5.EnumC6750p;

/* loaded from: classes2.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static int f34263a;

    public interface a {
        void a(String str, EnumC6750p enumC6750p);
    }

    private static final class b implements InterfaceC0979a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0982d f34264a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1017a f34265b;

        /* renamed from: c, reason: collision with root package name */
        private final a f34266c;

        /* renamed from: d, reason: collision with root package name */
        private final o5.Q f34267d;

        /* renamed from: e, reason: collision with root package name */
        private final int f34268e;

        public b(InterfaceC0982d interfaceC0982d, InterfaceC1017a interfaceC1017a, a aVar, o5.Q q8, int i8) {
            this.f34264a = interfaceC0982d;
            this.f34265b = interfaceC1017a;
            this.f34266c = aVar;
            this.f34268e = i8;
            this.f34267d = q8;
        }

        @Override // c3.InterfaceC0979a
        public void a(C0986h c0986h) {
            androidx.fragment.app.w wVar;
            C0986h.a C02 = c0986h.C0();
            int B02 = c0986h.B0();
            if (C02 != null) {
                long a8 = (C02.a() * 100) / C02.b();
            }
            if (b(B02)) {
                this.f34264a.b(this);
                O.m(this.f34267d);
                if (B02 == 4) {
                    O.o(this.f34265b, this.f34266c, this.f34268e);
                    return;
                }
                if (B02 == 5) {
                    try {
                        wVar = this.f34267d.a0();
                    } catch (IllegalStateException unused) {
                        wVar = null;
                    }
                    if (wVar != null) {
                        o5.T.t2().f(M2.f33916L3).d(M2.f33900J3).h(wVar);
                    }
                }
            }
        }

        public boolean b(int i8) {
            return i8 == 3 || i8 == 4 || i8 == 5;
        }
    }

    public static void A(final AbstractActivityC0835d abstractActivityC0835d, final a aVar) {
        AbstractC5673x.a("barcodeScan");
        final int i8 = f34263a + 1;
        f34263a = i8;
        final InterfaceC1017a b8 = AbstractC1019c.b(abstractActivityC0835d, new C1018b.a().c(8, 1, 32, 64, 128, 512, 1024).b().a());
        final InterfaceC0982d a8 = AbstractC0981c.a(abstractActivityC0835d);
        a8.e(b8).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.H
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                O.w(b8, aVar, i8, a8, abstractActivityC0835d, (C0980b) obj);
            }
        }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.I
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                O.x(exc);
            }
        });
    }

    public static void l() {
        AbstractC5673x.a("barcodeDlCancel");
        f34263a++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(o5.Q q8) {
        try {
            q8.g2();
        } catch (IllegalStateException unused) {
        }
    }

    private static void n(InterfaceC0982d interfaceC0982d, final InterfaceC1017a interfaceC1017a, final a aVar, androidx.fragment.app.w wVar, final int i8) {
        final o5.Q u22 = o5.Q.u2(wVar);
        if (u22 == null) {
            return;
        }
        interfaceC0982d.d(C0984f.d().a(interfaceC1017a).c(new b(interfaceC0982d, interfaceC1017a, aVar, u22, i8)).b()).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.M
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                O.p(u22, interfaceC1017a, aVar, i8, (C0985g) obj);
            }
        }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.N
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                O.q(u22, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(InterfaceC1017a interfaceC1017a, final a aVar, int i8) {
        if (i8 != f34263a) {
            AbstractC5673x.a("barcodeBadCounter");
        } else {
            interfaceC1017a.b().h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.J
                @Override // A3.InterfaceC0373g
                public final void b(Object obj) {
                    O.z((C0823a) obj, aVar);
                }
            }).a(new InterfaceC0370d() { // from class: com.headcode.ourgroceries.android.K
                @Override // A3.InterfaceC0370d
                public final void c() {
                    AbstractC5673x.a("barcodeAborted");
                }
            }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.L
                @Override // A3.InterfaceC0372f
                public final void e(Exception exc) {
                    O.t(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(o5.Q q8, InterfaceC1017a interfaceC1017a, a aVar, int i8, C0985g c0985g) {
        if (!c0985g.A0()) {
            AbstractC5673x.a("barcodeDlStarted");
            return;
        }
        AbstractC5673x.a("barcodeDlAlready");
        m(q8);
        o(interfaceC1017a, aVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(o5.Q q8, Exception exc) {
        AbstractC5673x.a("barcodeDlException");
        AbstractC6635a.c("OG-Barcode", exc);
        com.google.firebase.crashlytics.a.b().e(exc);
        m(q8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Exception exc) {
        AbstractC5673x.a("barcodeException");
        AbstractC6635a.c("OG-Barcode", exc);
        com.google.firebase.crashlytics.a.b().e(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(InterfaceC0982d interfaceC0982d, InterfaceC1017a interfaceC1017a, C0980b c0980b) {
        if (c0980b.A0()) {
            return;
        }
        AbstractC5673x.a("barcodePreChkMiss");
        interfaceC0982d.f(interfaceC1017a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Exception exc) {
        AbstractC5673x.a("barcodePreChkException");
        AbstractC6635a.c("OG-Barcode", exc);
        com.google.firebase.crashlytics.a.b().e(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(InterfaceC1017a interfaceC1017a, a aVar, int i8, InterfaceC0982d interfaceC0982d, AbstractActivityC0835d abstractActivityC0835d, C0980b c0980b) {
        if (c0980b.A0()) {
            AbstractC5673x.a("barcodeChkAvail");
            o(interfaceC1017a, aVar, i8);
        } else {
            AbstractC5673x.a("barcodeChkMiss");
            n(interfaceC0982d, interfaceC1017a, aVar, abstractActivityC0835d.getSupportFragmentManager(), i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Exception exc) {
        AbstractC5673x.a("barcodeChkException");
        AbstractC6635a.c("OG-Barcode", exc);
        com.google.firebase.crashlytics.a.b().e(exc);
    }

    public static void y(Context context) {
        final InterfaceC1017a a8 = AbstractC1019c.a(context);
        final InterfaceC0982d b8 = AbstractC0981c.b(context);
        b8.e(a8).h(new InterfaceC0373g() { // from class: com.headcode.ourgroceries.android.F
            @Override // A3.InterfaceC0373g
            public final void b(Object obj) {
                O.u(b8, a8, (C0980b) obj);
            }
        }).e(new InterfaceC0372f() { // from class: com.headcode.ourgroceries.android.G
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                O.v(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(C0823a c0823a, a aVar) {
        EnumC6750p enumC6750p;
        String b8 = c0823a.b();
        if (b8 == null || b8.isEmpty()) {
            AbstractC5673x.a("barcodeNull");
            return;
        }
        int a8 = c0823a.a();
        if (a8 == 1) {
            enumC6750p = EnumC6750p.CODE_128;
        } else if (a8 == 32) {
            enumC6750p = EnumC6750p.EAN_13;
        } else if (a8 == 64) {
            enumC6750p = EnumC6750p.EAN_8;
        } else if (a8 != 128) {
            enumC6750p = a8 != 512 ? a8 != 1024 ? EnumC6750p.BARCODETYPE_UNKNOWN : EnumC6750p.UPC_E : EnumC6750p.UPC_A;
        } else {
            if (b8.length() != 14) {
                AbstractC5673x.a("barcodeItf");
                return;
            }
            enumC6750p = EnumC6750p.ITF_14;
        }
        new ToneGenerator(3, 100).startTone(44, 150);
        AbstractC5673x.a("barcodeSuccess");
        aVar.a(b8, enumC6750p);
    }
}
