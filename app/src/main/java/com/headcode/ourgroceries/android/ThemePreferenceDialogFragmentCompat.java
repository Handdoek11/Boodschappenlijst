package com.headcode.ourgroceries.android;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import com.headcode.ourgroceries.android.R4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import o0.AbstractC6278a;
import p5.C6395a;

/* loaded from: classes2.dex */
public class ThemePreferenceDialogFragmentCompat extends androidx.preference.g {

    /* renamed from: d1, reason: collision with root package name */
    private static final ArgbEvaluator f34493d1 = new ArgbEvaluator();

    /* renamed from: R0, reason: collision with root package name */
    private R4.b f34494R0;

    /* renamed from: S0, reason: collision with root package name */
    private R4.b f34495S0;

    /* renamed from: T0, reason: collision with root package name */
    private R2 f34496T0;

    /* renamed from: U0, reason: collision with root package name */
    private View f34497U0;

    /* renamed from: V0, reason: collision with root package name */
    private RecyclerView f34498V0;

    /* renamed from: W0, reason: collision with root package name */
    private C5536e3 f34499W0;

    /* renamed from: X0, reason: collision with root package name */
    private Drawable f34500X0;

    /* renamed from: Y0, reason: collision with root package name */
    private View f34501Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private Button f34502Z0;

    /* renamed from: a1, reason: collision with root package name */
    private Button f34503a1;

    /* renamed from: b1, reason: collision with root package name */
    private C5643s4 f34504b1;

    /* renamed from: c1, reason: collision with root package name */
    private LinearLayoutManager f34505c1;

    private class ListViewDividerSetter {

        /* renamed from: a, reason: collision with root package name */
        private final int f34506a;

        @Keep
        public void setColor(int i8) {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.setIntrinsicWidth(this.f34506a);
            shapeDrawable.setIntrinsicHeight(this.f34506a);
            shapeDrawable.getPaint().setColor(i8);
            ThemePreferenceDialogFragmentCompat.this.f34504b1.j(shapeDrawable);
            ThemePreferenceDialogFragmentCompat.this.f34498V0.invalidate();
        }

        private ListViewDividerSetter(int i8) {
            this.f34506a = i8;
        }
    }

    private class b implements C5536e3.d {
        private b() {
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ int A(C6395a c6395a, int i8, Z0 z02) {
            return AbstractC5544f3.d(this, c6395a, i8, z02);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public String D(C6395a c6395a, int i8, Object obj) {
            if (!(obj instanceof R4.b)) {
                return AbstractC5544f3.g(this, c6395a, i8, obj);
            }
            return "theme-" + ((R4.b) obj).v();
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean E(Object obj) {
            return AbstractC5544f3.p(this, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public boolean F(C6395a c6395a, int i8, Z0 z02) {
            return false;
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public int G(C6395a c6395a, int i8, Object obj) {
            if (obj instanceof R4.b) {
                return 5;
            }
            return AbstractC5544f3.c(this, c6395a, i8, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void H() {
            AbstractC5544f3.o(this);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean J(int i8) {
            return AbstractC5544f3.s(this, i8);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public void K(C5536e3.g gVar, Object obj) {
            if (obj instanceof R4.b) {
                R4.b bVar = (R4.b) obj;
                R4.b b8 = R4.b(ThemePreferenceDialogFragmentCompat.this.B(), bVar);
                ThemePreferenceDialogFragmentCompat themePreferenceDialogFragmentCompat = ThemePreferenceDialogFragmentCompat.this;
                themePreferenceDialogFragmentCompat.S2(themePreferenceDialogFragmentCompat.f34495S0, b8, bVar);
                ThemePreferenceDialogFragmentCompat.this.f34494R0 = bVar;
                ThemePreferenceDialogFragmentCompat.this.f34495S0 = b8;
            }
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void L() {
            AbstractC5544f3.n(this);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ C5536e3.d.a M() {
            return AbstractC5544f3.b(this);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ String N(C6395a c6395a, int i8, String str) {
            return AbstractC5544f3.f(this, c6395a, i8, str);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void O(C6395a c6395a, int i8) {
            AbstractC5544f3.m(this, c6395a, i8);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ String b(C6395a c6395a, int i8, Z0 z02) {
            return AbstractC5544f3.e(this, c6395a, i8, z02);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void g(Object obj) {
            AbstractC5544f3.r(this, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
            return AbstractC5544f3.h(this, c6395a, i8, str);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void r(Object obj, boolean z7) {
            AbstractC5544f3.k(this, obj, z7);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public boolean s(C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
            Context B7 = ThemePreferenceDialogFragmentCompat.this.B();
            if (B7 == null) {
                return false;
            }
            TextView textView = gVar.f34713G;
            if (textView != null) {
                textView.setText("");
                gVar.f34713G.setVisibility(8);
            }
            if (!(obj instanceof R4.b)) {
                if (!(obj instanceof p5.c)) {
                    return false;
                }
                gVar.f34712F.setText(((p5.c) obj).c());
                ThemePreferenceDialogFragmentCompat themePreferenceDialogFragmentCompat = ThemePreferenceDialogFragmentCompat.this;
                themePreferenceDialogFragmentCompat.M2(gVar.f10944a, i8, themePreferenceDialogFragmentCompat.f34495S0, ThemePreferenceDialogFragmentCompat.this.f34495S0, ThemePreferenceDialogFragmentCompat.this.f34494R0, B7);
                return true;
            }
            R4.b bVar = (R4.b) obj;
            String string = B7.getString(bVar.s());
            ThemePreferenceDialogFragmentCompat.this.f34496T0.c(gVar.f34712F, null, null, gVar.f34717K);
            gVar.f34712F.setText(string);
            if (bVar == R4.b.f34374G) {
                gVar.f34713G.setText(ThemePreferenceDialogFragmentCompat.this.m0(M2.f33910K5));
                gVar.f34713G.setVisibility(0);
            }
            ThemePreferenceDialogFragmentCompat themePreferenceDialogFragmentCompat2 = ThemePreferenceDialogFragmentCompat.this;
            themePreferenceDialogFragmentCompat2.M2(gVar.f10944a, i8, themePreferenceDialogFragmentCompat2.f34495S0, ThemePreferenceDialogFragmentCompat.this.f34495S0, ThemePreferenceDialogFragmentCompat.this.f34494R0, B7);
            return true;
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void t(C6395a c6395a, int i8, int i9) {
            AbstractC5544f3.q(this, c6395a, i8, i9);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void v(Object obj) {
            AbstractC5544f3.j(this, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void z(Object obj, ContextMenu contextMenu) {
            AbstractC5544f3.l(this, obj, contextMenu);
        }
    }

    public ThemePreferenceDialogFragmentCompat() {
        R4.b bVar = R4.f34368a;
        this.f34494R0 = bVar;
        this.f34495S0 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2(View view, int i8, R4.b bVar, R4.b bVar2, R4.b bVar3, Context context) {
        Object n02 = this.f34499W0.n0(i8);
        View findViewById = view.findViewById(R.id.text1);
        if (!(n02 instanceof R4.b)) {
            ArgbEvaluator argbEvaluator = f34493d1;
            ObjectAnimator ofObject = ObjectAnimator.ofObject(findViewById, "backgroundColor", argbEvaluator, Integer.valueOf(AbstractC6278a.c(context, bVar.k())), Integer.valueOf(AbstractC6278a.c(context, bVar2.k())));
            ofObject.setDuration(150L);
            ofObject.start();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(findViewById, "textColor", argbEvaluator, Integer.valueOf(AbstractC6278a.c(context, bVar.l())), Integer.valueOf(AbstractC6278a.c(context, bVar2.l())));
            ofObject2.setDuration(150L);
            ofObject2.start();
            return;
        }
        ArgbEvaluator argbEvaluator2 = f34493d1;
        ObjectAnimator ofObject3 = ObjectAnimator.ofObject(view, "backgroundColor", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(context, bVar.m())), Integer.valueOf(AbstractC6278a.c(context, bVar2.m())));
        ofObject3.setDuration(150L);
        ofObject3.start();
        ObjectAnimator ofObject4 = ObjectAnimator.ofObject(findViewById, "textColor", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(context, bVar.q())), Integer.valueOf(AbstractC6278a.c(context, bVar2.q())));
        ofObject4.setDuration(150L);
        ofObject4.start();
        View findViewById2 = view.findViewById(R.id.text2);
        if (findViewById2 != null) {
            ObjectAnimator ofObject5 = ObjectAnimator.ofObject(findViewById2, "textColor", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(context, bVar.p())), Integer.valueOf(AbstractC6278a.c(context, bVar2.p())));
            ofObject5.setDuration(150L);
            ofObject5.start();
        }
        int c8 = AbstractC6278a.c(context, bVar2.g());
        CheckedTextView checkedTextView = (CheckedTextView) findViewById;
        boolean z7 = n02 == bVar3;
        if (z7) {
            P1.Z(this.f34500X0, c8);
        }
        checkedTextView.setChecked(z7);
        checkedTextView.setCheckMarkDrawable(z7 ? this.f34500X0 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N2(Context context, View view) {
        i2().dismiss();
        AbstractC5673x.a("themeSelecting" + this.f34494R0.name());
        R4.g(context, this.f34494R0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O2(View view) {
        i2().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P2(int i8, Boolean bool) {
        this.f34505c1.E2(i8, this.f34498V0.getHeight() / 2);
    }

    public static ThemePreferenceDialogFragmentCompat Q2(String str) {
        ThemePreferenceDialogFragmentCompat themePreferenceDialogFragmentCompat = new ThemePreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        themePreferenceDialogFragmentCompat.R1(bundle);
        return themePreferenceDialogFragmentCompat;
    }

    private void R2() {
        Context B7 = B();
        C6395a c6395a = new C6395a(R4.b.values().length + 10);
        c6395a.l(p5.c.g(String.valueOf(1), B7.getString(M2.f33926M5)), false);
        ArrayList<R4.b> arrayList = new ArrayList(R4.b.values().length);
        for (R4.b bVar : R4.b.values()) {
            if (bVar.x()) {
                c6395a.a(bVar);
            } else {
                arrayList.add(bVar);
            }
        }
        Collections.sort(arrayList, R4.b.z(B7));
        c6395a.l(p5.c.g(String.valueOf(2), B7.getString(M2.f33934N5)), false);
        int i8 = 3;
        int i9 = 0;
        for (R4.b bVar2 : arrayList) {
            if (i9 >= 4) {
                c6395a.l(p5.c.g(String.valueOf(i8), B7.getString(M2.f33934N5)), false);
                i8++;
                i9 = 0;
            }
            c6395a.a(bVar2);
            i9++;
        }
        this.f34499W0.G0(c6395a, false);
        final int k8 = c6395a.k(this.f34494R0);
        if (k8 >= 0) {
            X2.m(this.f34497U0).u().a(new f6.d() { // from class: com.headcode.ourgroceries.android.P4
                @Override // f6.d
                public final void accept(Object obj) {
                    this.f34326o.P2(k8, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2(R4.b bVar, R4.b bVar2, R4.b bVar3) {
        int i8;
        HashSet hashSet;
        String str;
        int i9;
        if (bVar != bVar2) {
            AbstractC5673x.a("themeViewing" + bVar2.name());
        }
        Context B7 = B();
        if (B7 == null) {
            return;
        }
        Resources resources = B7.getResources();
        View findViewById = this.f34497U0.findViewById(H2.f33617t1);
        ArgbEvaluator argbEvaluator = f34493d1;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(findViewById, "backgroundColor", argbEvaluator, Integer.valueOf(AbstractC6278a.c(B7, bVar.u())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.u())));
        ofObject.setDuration(150L);
        ofObject.start();
        View findViewById2 = this.f34497U0.findViewById(H2.f33609r);
        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(findViewById2, "backgroundColor", argbEvaluator, Integer.valueOf(AbstractC6278a.c(B7, bVar.h())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.h())));
        ofObject2.setDuration(150L);
        ofObject2.start();
        String str2 = "textColor";
        ObjectAnimator ofObject3 = ObjectAnimator.ofObject(findViewById2, "textColor", argbEvaluator, Integer.valueOf(AbstractC6278a.c(B7, bVar.i())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.i())));
        ofObject3.setDuration(150L);
        ofObject3.start();
        int O7 = this.f34505c1.O();
        HashSet hashSet2 = new HashSet(O7);
        int i10 = 0;
        while (i10 < O7) {
            View N7 = this.f34505c1.N(i10);
            if (N7 != null) {
                int l02 = this.f34505c1.l0(N7);
                hashSet2.add(Integer.valueOf(l02));
                i8 = i10;
                i9 = O7;
                str = str2;
                hashSet = hashSet2;
                M2(N7, l02, bVar, bVar2, bVar3, B7);
            } else {
                i8 = i10;
                hashSet = hashSet2;
                str = str2;
                i9 = O7;
            }
            i10 = i8 + 1;
            hashSet2 = hashSet;
            O7 = i9;
            str2 = str;
        }
        HashSet hashSet3 = hashSet2;
        String str3 = str2;
        for (int i11 = 0; i11 < this.f34499W0.E(); i11++) {
            if (!hashSet3.contains(Integer.valueOf(i11))) {
                this.f34499W0.K(i11);
            }
        }
        ListViewDividerSetter listViewDividerSetter = new ListViewDividerSetter(Math.max((int) ((resources.getDisplayMetrics().density * 1.0f) + 0.5f), 1));
        ArgbEvaluator argbEvaluator2 = f34493d1;
        ObjectAnimator ofObject4 = ObjectAnimator.ofObject(listViewDividerSetter, "color", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(B7, bVar.r())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.r())));
        ofObject4.setDuration(150L);
        ofObject4.start();
        ObjectAnimator ofObject5 = ObjectAnimator.ofObject(this.f34498V0, "backgroundColor", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(B7, bVar.m())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.m())));
        ofObject5.setDuration(150L);
        ofObject5.start();
        ObjectAnimator ofObject6 = ObjectAnimator.ofObject(this.f34501Y0, "backgroundColor", argbEvaluator2, Integer.valueOf(AbstractC6278a.c(B7, bVar.m())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.m())));
        ofObject6.setDuration(150L);
        ofObject6.start();
        ObjectAnimator ofObject7 = ObjectAnimator.ofObject(this.f34502Z0, str3, argbEvaluator2, Integer.valueOf(AbstractC6278a.c(B7, bVar.g())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.g())));
        ofObject7.setDuration(150L);
        ofObject7.start();
        ObjectAnimator ofObject8 = ObjectAnimator.ofObject(this.f34503a1, str3, argbEvaluator2, Integer.valueOf(AbstractC6278a.c(B7, bVar.g())), Integer.valueOf(AbstractC6278a.c(B7, bVar2.g())));
        ofObject8.setDuration(150L);
        ofObject8.start();
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            this.f34494R0 = R4.d(B());
        } else {
            this.f34494R0 = R4.b.values()[bundle.getInt("ThemePreferenceDialogFragmentCompat.theme", R4.f34368a.ordinal())];
        }
        this.f34495S0 = R4.b(B(), this.f34494R0);
    }

    @Override // androidx.preference.g, androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putInt("ThemePreferenceDialogFragmentCompat.theme", this.f34494R0.ordinal());
    }

    @Override // androidx.preference.g
    protected void u2(View view) {
        super.u2(view);
        final Context B7 = B();
        if (B7 == null) {
            return;
        }
        this.f34496T0 = new R2(B7);
        this.f34500X0 = AbstractC6278a.e(B7, G2.f33458f);
        this.f34497U0 = view;
        this.f34498V0 = (RecyclerView) view.findViewById(H2.f33489B1);
        this.f34501Y0 = this.f34497U0.findViewById(H2.f33499F);
        this.f34502Z0 = (Button) this.f34497U0.findViewById(H2.f33584i1);
        this.f34503a1 = (Button) this.f34497U0.findViewById(H2.f33502G);
        this.f34499W0 = new C5536e3(B7, new b());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(B7);
        this.f34505c1 = linearLayoutManager;
        this.f34498V0.setLayoutManager(linearLayoutManager);
        this.f34498V0.setAdapter(this.f34499W0);
        C5536e3 c5536e3 = this.f34499W0;
        Objects.requireNonNull(c5536e3);
        C5643s4 c5643s4 = new C5643s4(B7, c5536e3.new f());
        this.f34504b1 = c5643s4;
        this.f34498V0.j(c5643s4);
        R4.b bVar = this.f34495S0;
        S2(bVar, bVar, this.f34494R0);
        this.f34502Z0.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.N4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f34260o.N2(B7, view2);
            }
        });
        this.f34503a1.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.O4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f34280o.O2(view2);
            }
        });
        R2();
    }

    @Override // androidx.preference.g
    public void w2(boolean z7) {
    }
}
