package com.headcode.ourgroceries.android;

import a6.AbstractC0829f;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.android.billingclient.api.SkuDetails;
import com.headcode.ourgroceries.android.C5503a2;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.UpgradeActivity;
import d6.InterfaceC5732b;
import n5.C6272v;

/* loaded from: classes2.dex */
public class UpgradeActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    private View f34558O;

    /* renamed from: P, reason: collision with root package name */
    private View f34559P;

    /* renamed from: Q, reason: collision with root package name */
    private View f34560Q;

    /* renamed from: R, reason: collision with root package name */
    private InterfaceC5732b f34561R;

    /* renamed from: S, reason: collision with root package name */
    private InterfaceC5732b f34562S;

    /* renamed from: T, reason: collision with root package name */
    private C6272v f34563T;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34564a;

        static {
            int[] iArr = new int[C5587k6.e.values().length];
            f34564a = iArr;
            try {
                iArr[C5587k6.e.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34564a[C5587k6.e.YEARLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34564a[C5587k6.e.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34564a[C5587k6.e.LIFETIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34564a[C5587k6.e.NBO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34564a[C5587k6.e.TEAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C5587k6.b f34565a;

        /* renamed from: b, reason: collision with root package name */
        private final Z1 f34566b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f34567c;

        /* renamed from: d, reason: collision with root package name */
        private final C5503a2 f34568d;

        /* renamed from: e, reason: collision with root package name */
        private final C5503a2 f34569e;

        /* renamed from: f, reason: collision with root package name */
        private final C5503a2 f34570f;

        public b(C5587k6.b bVar, Z1 z12, boolean z7, C5503a2 c5503a2, C5503a2 c5503a22, C5503a2 c5503a23) {
            this.f34565a = bVar;
            this.f34566b = z12;
            this.f34567c = z7;
            this.f34568d = c5503a2;
            this.f34569e = c5503a22;
            this.f34570f = c5503a23;
        }

        public C5587k6.b a() {
            return this.f34565a;
        }

        public C5503a2 b() {
            return this.f34570f;
        }

        public C5503a2 c() {
            return this.f34568d;
        }

        public Z1 d() {
            return this.f34566b;
        }

        public C5503a2 e() {
            return this.f34569e;
        }

        public boolean f() {
            return this.f34567c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String A2(SkuDetails skuDetails) {
        return getString(M2.f34183s6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(C5587k6 c5587k6, View view) {
        AbstractC5673x.a("switchLifetimeButton");
        if (c5587k6.D(this)) {
            return;
        }
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C2(View view) {
        AbstractC5673x.a("cancelYearlyButton");
        C5587k6.v0(this, "personal_yearly");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long D2() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long E2() {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String F2(SkuDetails skuDetails) {
        return getString(M2.f34191t6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String G2(b bVar, SkuDetails skuDetails) {
        return j2(skuDetails, bVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(C5587k6.e eVar, C5587k6 c5587k6, View view) {
        AbstractC5673x.a("upgradeMonthlyButton");
        if (eVar == C5587k6.e.MONTHLY) {
            C5587k6.v0(this, "personal_monthly");
        } else {
            if (c5587k6.E(this)) {
                return;
            }
            T2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String J2(SkuDetails skuDetails) {
        return getString(M2.f34199u6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String K2(b bVar, SkuDetails skuDetails) {
        return j2(skuDetails, bVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String M2(int i8, SkuDetails skuDetails) {
        return getString(i8, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String N2(int i8) {
        return getString(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(View view) {
        AbstractC5673x.a("upgradeKeyButton");
        if (P1.R(this, "restore")) {
            return;
        }
        AbstractC5673x.a("upgradeKeyButtonFail");
        o5.T.t2().d(M2.f33871F6).g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(C5587k6 c5587k6, View view) {
        c5587k6.J(this.f34560Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q2(Integer num) {
        if (num.intValue() != 0) {
            return;
        }
        o5.T.t2().f(M2.f33903J6).d(M2.f33895I6).g(this);
    }

    private void R2(View view, int i8) {
        view.findViewById(H2.f33516K1).setBackgroundColor(i8);
    }

    private void S2(View view, int i8) {
        view.findViewById(H2.f33516K1).setBackgroundResource(i8);
    }

    private void T2() {
        o5.T.t2().f(M2.f33887H6).d(M2.f33879G6).g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f2(final com.headcode.ourgroceries.android.UpgradeActivity.b r25) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.UpgradeActivity.f2(com.headcode.ourgroceries.android.UpgradeActivity$b):void");
    }

    private void g2() {
        ImageView imageView = this.f34563T.f39753d;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, (((intrinsicHeight * r3.widthPixels) + intrinsicWidth) - 1) / intrinsicWidth));
    }

    private void h2(View view, String str, String str2, String str3, View.OnClickListener onClickListener) {
        view.setVisibility(0);
        TextView textView = (TextView) view.findViewById(H2.f33507H1);
        TextView textView2 = (TextView) view.findViewById(H2.f33501F1);
        TextView textView3 = (TextView) view.findViewById(H2.f33504G1);
        textView.setText(str);
        if (str2 == null) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        if (str3 == null) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str3);
        }
        view.setOnClickListener(onClickListener);
        R2(view, P1.v(view.getContext(), C2.f33316g, view.getContext().getColor(E2.f33378B)));
    }

    private String i2(C5503a2 c5503a2, final int i8, final int i9) {
        return (String) c5503a2.b(new C5503a2.b() { // from class: com.headcode.ourgroceries.android.C5
            @Override // com.headcode.ourgroceries.android.C5503a2.b
            public final Object apply(Object obj) {
                return this.f33320a.M2(i8, (SkuDetails) obj);
            }
        }, new C5503a2.c() { // from class: com.headcode.ourgroceries.android.D5
            @Override // com.headcode.ourgroceries.android.C5503a2.c
            public final Object get() {
                return this.f33355a.N2(i9);
            }
        });
    }

    private String j2(SkuDetails skuDetails, boolean z7) {
        int L7;
        if (!z7 || (L7 = P1.L(skuDetails.a())) == 0) {
            return null;
        }
        return getString(M2.f34111j6, Integer.toString(L7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(C5587k6.e eVar, C5587k6 c5587k6, View view) {
        AbstractC5673x.a("upgradeYearlyButton");
        if (eVar == C5587k6.e.YEARLY) {
            C5587k6.v0(this, "personal_yearly");
        } else {
            if (c5587k6.G(this)) {
                return;
            }
            T2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String l2(SkuDetails skuDetails) {
        return getString(M2.f34183s6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(C5587k6 c5587k6, View view) {
        AbstractC5673x.a("upgradeLifetimeButton");
        if (c5587k6.D(this)) {
            return;
        }
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String n2(SkuDetails skuDetails) {
        return getString(M2.f34199u6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String o2(b bVar, SkuDetails skuDetails) {
        return j2(skuDetails, bVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r2(C5587k6 c5587k6, View view) {
        AbstractC5673x.a("switchYearlyButton");
        if (c5587k6.G(this)) {
            return;
        }
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String s2(SkuDetails skuDetails) {
        return getString(M2.f34183s6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t2(C5587k6 c5587k6, View view) {
        AbstractC5673x.a("switchLifetimeButton");
        if (c5587k6.D(this)) {
            return;
        }
        T2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u2(View view) {
        AbstractC5673x.a("cancelMonthlyButton");
        C5587k6.v0(this, "personal_monthly");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String v2() {
        return getString(M2.f34207v6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String w2(SkuDetails skuDetails) {
        return getString(M2.f34191t6, skuDetails.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x2(b bVar, SkuDetails skuDetails) {
        return j2(skuDetails, bVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y2() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(C5587k6 c5587k6, View view) {
        AbstractC5673x.a("switchMonthlyButton");
        if (c5587k6.E(this)) {
            return;
        }
        T2();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6272v c8 = C6272v.c(getLayoutInflater());
        this.f34563T = c8;
        setContentView(c8.b());
        L0();
        if (bundle == null) {
            AbstractC5673x.a("upgradeActivity");
        }
        final C5587k6 Z02 = Z0();
        g2();
        C6272v c6272v = this.f34563T;
        this.f34558O = c6272v.f39760k;
        CardView cardView = c6272v.f39758i;
        this.f34559P = cardView;
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34660o.O2(view);
            }
        });
        Button button = this.f34563T.f39754e;
        this.f34560Q = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.m5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34918o.P2(Z02, view);
            }
        });
        this.f34561R = AbstractC0829f.f(Z02.N(), Z02.O(), Z02.M(), Z02.S().y(new f6.g() { // from class: com.headcode.ourgroceries.android.x5
            @Override // f6.g
            public final Object apply(Object obj) {
                return C5503a2.e((SkuDetails) obj);
            }
        }).C(C5503a2.a()), Z02.V().y(new f6.g() { // from class: com.headcode.ourgroceries.android.x5
            @Override // f6.g
            public final Object apply(Object obj) {
                return C5503a2.e((SkuDetails) obj);
            }
        }).C(C5503a2.a()), Z02.R().y(new f6.g() { // from class: com.headcode.ourgroceries.android.x5
            @Override // f6.g
            public final Object apply(Object obj) {
                return C5503a2.e((SkuDetails) obj);
            }
        }).C(C5503a2.a()), new f6.f() { // from class: com.headcode.ourgroceries.android.E5
            @Override // f6.f
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return new UpgradeActivity.b((C5587k6.b) obj, (Z1) obj2, ((Boolean) obj3).booleanValue(), (C5503a2) obj4, (C5503a2) obj5, (C5503a2) obj6);
            }
        }).E(new f6.d() { // from class: com.headcode.ourgroceries.android.F5
            @Override // f6.d
            public final void accept(Object obj) {
                this.f33449o.f2((UpgradeActivity.b) obj);
            }
        });
        this.f34562S = Z02.L().E(new f6.d() { // from class: com.headcode.ourgroceries.android.G5
            @Override // f6.d
            public final void accept(Object obj) {
                this.f33469o.Q2((Integer) obj);
            }
        });
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC5732b interfaceC5732b = this.f34561R;
        if (interfaceC5732b != null) {
            interfaceC5732b.c();
            this.f34561R = null;
        }
        InterfaceC5732b interfaceC5732b2 = this.f34562S;
        if (interfaceC5732b2 != null) {
            interfaceC5732b2.c();
            this.f34562S = null;
        }
    }
}
