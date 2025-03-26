package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.headcode.ourgroceries.android.O;
import j1.C6051a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import n5.C6257g;
import o5.C6299h;
import o5.C6302k;
import o5.C6315y;
import q5.AbstractC6635a;
import s5.EnumC6750p;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public final class ItemDetailsActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    private String f33646O = null;

    /* renamed from: P, reason: collision with root package name */
    private String f33647P = null;

    /* renamed from: Q, reason: collision with root package name */
    private C5688z0 f33648Q = null;

    /* renamed from: R, reason: collision with root package name */
    private Z0 f33649R = null;

    /* renamed from: S, reason: collision with root package name */
    private b f33650S;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33651a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33652b;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f33652b = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33652b[s5.Q.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33652b[s5.Q.CATEGORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33652b[s5.Q.MASTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33652b[s5.Q.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[s5.r0.values().length];
            f33651a = iArr2;
            try {
                iArr2[s5.r0.STAR_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33651a[s5.r0.STAR_YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final C6257g f33653a;

        /* renamed from: b, reason: collision with root package name */
        private s5.r0 f33654b = s5.r0.STAR_NONE;

        /* renamed from: c, reason: collision with root package name */
        private String f33655c = "";

        /* renamed from: d, reason: collision with root package name */
        private String f33656d = "";

        /* renamed from: e, reason: collision with root package name */
        private String f33657e = "";

        /* renamed from: f, reason: collision with root package name */
        private String f33658f = "";

        /* renamed from: g, reason: collision with root package name */
        private boolean f33659g = false;

        /* renamed from: h, reason: collision with root package name */
        private String f33660h = "";

        /* renamed from: i, reason: collision with root package name */
        private int f33661i = 0;

        /* renamed from: j, reason: collision with root package name */
        private boolean f33662j = false;

        class a implements TextWatcher {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ItemDetailsActivity f33664o;

            a(ItemDetailsActivity itemDetailsActivity) {
                this.f33664o = itemDetailsActivity;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (b.this.f33662j) {
                    return;
                }
                b bVar = b.this;
                bVar.f33660h = bVar.v();
                b.this.f33661i = 0;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        }

        public b(C6257g c6257g) {
            this.f33653a = c6257g;
            c6257g.f39650l.addTextChangedListener(new a(ItemDetailsActivity.this));
        }

        private String A(TextView textView) {
            return textView.getText().toString().trim();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(int i8) {
            String a8;
            int i9 = this.f33661i + i8;
            String v7 = v();
            if (A2.f33140n0.U(s5.G.FEATURE_UNITS_MORE_LESS)) {
                try {
                    a8 = Units.a(this.f33660h, i9);
                } catch (RuntimeException e8) {
                    String str = "Exception calling units JNI on \"" + this.f33660h + "\" with delta " + i9 + ": " + e8;
                    AbstractC6635a.b("OG-ItemDetails", str);
                    ItemDetailsActivity.this.Y0().t0(str);
                    return;
                }
            } else {
                a8 = AbstractC6803e.a(this.f33660h, i9);
            }
            if (a8.equals(v7)) {
                return;
            }
            this.f33661i = i9;
            this.f33662j = true;
            try {
                E(a8, false);
            } finally {
                this.f33662j = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(String str) {
            this.f33657e = str;
            this.f33653a.f39646h.setText(P1.c(str));
            this.f33653a.f39645g.setVisibility(this.f33657e.isEmpty() ? 8 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean D(String str) {
            boolean z7 = !AbstractC6803e.c(this.f33655c, str);
            this.f33655c = str;
            Z0 C7 = ItemDetailsActivity.this.V0().C(str);
            StringBuilder sb = new StringBuilder();
            sb.append(ItemDetailsActivity.this.getString(M2.f34163q2));
            sb.append(": ");
            sb.append(C7 == null ? ItemDetailsActivity.this.getString(M2.f34087g6) : C7.E());
            this.f33653a.f39647i.setText(sb.toString());
            return z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(String str, boolean z7) {
            J(this.f33653a.f39650l, str, z7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(String str) {
            J(this.f33653a.f39651m, str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(String str) {
            if (this.f33659g && this.f33658f.equals(str)) {
                return;
            }
            this.f33658f = str;
            this.f33659g = true;
            if (AbstractC6803e.o(str)) {
                this.f33653a.f39643e.setVisibility(0);
                this.f33653a.f39654p.setVisibility(8);
                this.f33653a.f39649k.setVisibility(8);
            } else {
                C6051a A12 = PhotoViewActivity.A1(ItemDetailsActivity.this);
                this.f33653a.f39654p.setVisibility(0);
                ((com.bumptech.glide.j) ((com.bumptech.glide.j) ((com.bumptech.glide.j) ((com.bumptech.glide.j) AbstractC5648t2.c(ItemDetailsActivity.this, str).a0(A12)).Z(P1.n(ItemDetailsActivity.this), 1)).l(G2.f33455c)).j0(new com.bumptech.glide.load.resource.bitmap.F(P1.i(20)))).x0(new C5557h0(this.f33653a.f39654p));
                this.f33653a.f39643e.setVisibility(8);
                this.f33653a.f39649k.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(String str) {
            this.f33656d = str;
            if (ItemDetailsActivity.this.V0().O() != null) {
                this.f33653a.f39657s.setVisibility(8);
                return;
            }
            this.f33653a.f39657s.setVisibility(0);
            StringBuilder sb = new StringBuilder();
            if (ItemDetailsActivity.this.Q1()) {
                sb.append(ItemDetailsActivity.this.getString(M2.f34179s2));
            } else {
                sb.append(ItemDetailsActivity.this.getString(M2.f34195u2));
            }
            sb.append(": ");
            if (str.isEmpty()) {
                sb.append(ItemDetailsActivity.this.getString(M2.f34171r2));
            } else {
                C5688z0 x7 = ItemDetailsActivity.this.V0().x(str);
                if (x7 != null) {
                    sb.append(x7.W());
                } else {
                    if (!ItemDetailsActivity.this.Q1()) {
                        ItemDetailsActivity.this.finish();
                        return;
                    }
                    sb.append(ItemDetailsActivity.this.getString(M2.f34171r2));
                }
            }
            this.f33653a.f39657s.setText(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(s5.r0 r0Var) {
            this.f33654b = r0Var;
            int i8 = a.f33651a[r0Var.ordinal()] != 2 ? C2.f33315f : C2.f33318i;
            TypedValue typedValue = new TypedValue();
            if (ItemDetailsActivity.this.getTheme().resolveAttribute(i8, typedValue, true)) {
                this.f33653a.f39658t.setImageResource(typedValue.resourceId);
            }
        }

        private void J(EditText editText, String str, boolean z7) {
            str.length();
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            editText.setText(str);
            int length = editText.length();
            if (z7) {
                editText.setSelection(length);
            } else {
                editText.setSelection(Math.min(selectionStart, length), Math.min(selectionEnd, length));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K() {
            s5.r0 z7 = z();
            s5.r0 r0Var = s5.r0.STAR_NONE;
            if (z7 == r0Var) {
                r0Var = s5.r0.STAR_YELLOW;
            }
            I(r0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void L() {
            this.f33653a.f39642d.setVisibility(!ItemDetailsActivity.this.Z0().U().f() ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String t() {
            return this.f33657e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String u() {
            return this.f33655c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String v() {
            return A(this.f33653a.f39650l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String w() {
            return A(this.f33653a.f39651m);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String x() {
            return this.f33658f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public s5.r0 z() {
            return this.f33654b;
        }

        public String y() {
            return this.f33656d;
        }
    }

    private void O1(C6257g c6257g) {
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: com.headcode.ourgroceries.android.p0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return this.f34964o.R1(textView, i8, keyEvent);
            }
        };
        c6257g.f39650l.setOnEditorActionListener(onEditorActionListener);
        c6257g.f39651m.setOnEditorActionListener(onEditorActionListener);
        c6257g.f39650l.setInputType(98305 | R0());
        c6257g.f39652n.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35018o.X1(view);
            }
        });
        c6257g.f39653o.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35042o.Y1(view);
            }
        });
        c6257g.f39658t.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35055o.Z1(view);
            }
        });
        c6257g.f39647i.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35093o.a2(view);
            }
        });
        c6257g.f39657s.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35102o.b2(view);
            }
        });
        c6257g.f39644f.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34834o.c2(view);
            }
        });
        c6257g.f39654p.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34879o.d2(view);
            }
        });
        c6257g.f39659u.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34891o.e2(view);
            }
        });
        c6257g.f39648j.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34941o.S1(view);
            }
        });
        if (!P1.y()) {
            c6257g.f39659u.setVisibility(8);
        }
        c6257g.f39649k.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34983o.T1(view);
            }
        });
        View o12 = o1(J2.f33673C, H2.f33595m0);
        o12.findViewById(H2.f33592l0).setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34991o.U1(view);
            }
        });
        o12.findViewById(H2.f33577g0).setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35005o.W1(view);
            }
        });
        c6257g.f39641c.setText(M2.f34155p2);
    }

    private static int P1(View view, View view2) {
        int i8 = 0;
        while (view != view2) {
            i8 += view.getTop();
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q1() {
        return this.f33648Q.U() == s5.Q.RECIPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean R1(TextView textView, int i8, KeyEvent keyEvent) {
        if (this.f33650S.v().isEmpty()) {
            return false;
        }
        finish();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(View view) {
        AbstractC5673x.a("choosePhotoStart");
        AbstractC5662v2.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(View view) {
        this.f33650S.G("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(View view) {
        Z0 z02;
        if (this.f33646O == null || (z02 = this.f33649R) == null) {
            return;
        }
        C6315y.u2(this.f33648Q, z02).r2(getSupportFragmentManager(), "unused");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(String str, EnumC6750p enumC6750p) {
        this.f33650S.C(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(View view) {
        O.A(this, new O.a() { // from class: com.headcode.ourgroceries.android.o0
            @Override // com.headcode.ourgroceries.android.O.a
            public final void a(String str, EnumC6750p enumC6750p) {
                this.f34952a.V1(str, enumC6750p);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1(View view) {
        this.f33650S.B(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1(View view) {
        this.f33650S.B(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1(View view) {
        this.f33650S.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(View view) {
        AbstractC5625q.j(this, this.f33648Q, this.f33649R, this.f33650S.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(View view) {
        AbstractC5625q.n(this, this.f33650S.y(), Q1() ? getString(M2.f34171r2) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(View view) {
        this.f33650S.C("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(View view) {
        AbstractC5625q.s(this, this.f33650S.v(), this.f33650S.w(), this.f33650S.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(View view) {
        AbstractC5673x.a("takePhotoStart");
        AbstractC5662v2.o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f2(C6257g c6257g, ScrollView scrollView) {
        FrameLayout frameLayout = c6257g.f39655q;
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.requestFocus();
        scrollView.scrollTo(0, P1(frameLayout, scrollView));
    }

    private void g2() {
        if (this.f33648Q == null || this.f33649R == null) {
            return;
        }
        C5574j1 V02 = V0();
        V02.q0();
        try {
            this.f33649R = V02.J0(this.f33648Q, this.f33649R, this.f33650S.v(), this.f33650S.w());
            s5.r0 z7 = this.f33650S.z();
            if (z7 != this.f33649R.C()) {
                this.f33649R = V02.L0(this.f33648Q, this.f33649R, z7);
            }
            String u7 = this.f33650S.u();
            if (!u7.equals(this.f33649R.u())) {
                this.f33649R = V02.I0(this.f33648Q, this.f33649R, u7);
            }
            String t7 = this.f33650S.t();
            if (!t7.equals(this.f33649R.s())) {
                this.f33649R = V02.G0(this.f33648Q, this.f33649R, t7);
            }
            String x7 = this.f33650S.x();
            if (!x7.equals(this.f33649R.A())) {
                this.f33649R = V02.K0(this.f33648Q, this.f33649R, x7);
            }
            String y7 = this.f33650S.y();
            C5688z0 x8 = AbstractC6803e.o(y7) ? null : V02.x(y7);
            if (Q1()) {
                this.f33649R = V02.D0(this.f33648Q, this.f33649R, x8);
            } else if (x8 != null) {
                this.f33649R = V02.p0(this.f33648Q, x8, this.f33649R);
            }
            V02.C0();
        } catch (Throwable th) {
            V02.C0();
            throw th;
        }
    }

    private void h2() {
        Z0 z02;
        m5.j jVar = new m5.j("Item Details", Q0());
        if (A2.f33140n0.y() && (z02 = this.f33649R) != null) {
            jVar.a(z02.G());
            C5688z0 c5688z0 = this.f33648Q;
            if (c5688z0 != null) {
                c5688z0.r(jVar);
            }
        }
        P0().m(jVar);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (V0().x(this.f33646O) == null) {
            finish();
            return;
        }
        Z0 J7 = this.f33648Q.J(this.f33647P);
        if (J7 == null) {
            finish();
            return;
        }
        if (!this.f33649R.E().equals(J7.E()) && this.f33649R.E().equals(this.f33650S.v())) {
            this.f33650S.E(J7.E(), false);
        }
        if (!this.f33649R.y().equals(J7.y()) && this.f33649R.y().equals(this.f33650S.w())) {
            this.f33650S.F(J7.y());
        }
        if (this.f33649R.C() == this.f33650S.z()) {
            this.f33650S.I(J7.C());
        }
        if (this.f33649R.u().equals(this.f33650S.u())) {
            this.f33650S.D(J7.u());
        } else if (c5688z0 == null || c5688z0.U() == s5.Q.CATEGORY) {
            b bVar = this.f33650S;
            bVar.D(bVar.u());
        }
        if (Q1()) {
            if (this.f33649R.D().equals(this.f33650S.y())) {
                this.f33650S.H(J7.D());
            } else if (c5688z0 == null || c5688z0.U() == s5.Q.SHOPPING) {
                b bVar2 = this.f33650S;
                bVar2.H(bVar2.y());
            }
        } else if (c5688z0 == null || c5688z0 == this.f33648Q) {
            this.f33650S.H(this.f33646O);
        }
        if (this.f33649R.s().equals(this.f33650S.t())) {
            this.f33650S.C(J7.s());
        }
        if (this.f33649R.A().equals(this.f33650S.x())) {
            this.f33650S.G(J7.A());
        }
        this.f33649R = J7;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected m5.p Q0() {
        s5.Q U7 = this.f33648Q.U();
        int i8 = a.f33652b[U7.ordinal()];
        if (i8 == 1) {
            return m5.p.SHOPPING_LIST_ITEM_DETAILS;
        }
        if (i8 == 2) {
            return m5.p.RECIPE_ITEM_DETAILS;
        }
        if (i8 != 3 && i8 != 4 && i8 != 5) {
            return null;
        }
        throw new IllegalStateException("Unexpected list type: " + U7);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected void k1(CharSequence charSequence, C5688z0 c5688z0, List list) {
        if (list.isEmpty()) {
            return;
        }
        V1.b(charSequence, true);
        Intent intent = new Intent();
        intent.putExtra("com.headcode.ourgroceries.ItemID", ((Z0) list.get(0)).w());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1) {
            return;
        }
        if (i8 == 3) {
            this.f33650S.H(ListPickerActivity.B1(intent));
            return;
        }
        FileInputStream fileInputStream = null;
        fileInputStream = null;
        if (i8 == 4) {
            String stringExtra = intent != null ? intent.getStringExtra("com.headcode.ourgroceries.CategoryID") : null;
            if (stringExtra != null && this.f33650S.D(stringExtra)) {
                if (stringExtra.isEmpty()) {
                    A2.f33140n0.R();
                } else {
                    A2.f33140n0.S();
                }
            }
            C6302k.w2(getSupportFragmentManager());
            C6299h.w2(getSupportFragmentManager());
            return;
        }
        String a8 = AbstractC5662v2.a(this, i8, intent);
        if (a8 == null || this.f33648Q == null || this.f33649R == null) {
            return;
        }
        File g8 = AbstractC5662v2.g(this, a8);
        if (g8 != null) {
            try {
                if (g8.exists()) {
                    try {
                        long length = g8.length();
                        AbstractC6635a.a("OG-ItemDetails", "Upload photo of size " + length);
                        FileInputStream fileInputStream2 = new FileInputStream(g8);
                        try {
                            Y0().f1(a8, com.google.protobuf.d.C(fileInputStream2, (int) length));
                            P1.e(fileInputStream2);
                            this.f33650S.G(a8);
                            return;
                        } catch (IOException e8) {
                            e = e8;
                            fileInputStream = fileInputStream2;
                            AbstractC6635a.f("OG-ItemDetails", "Can't read photo " + a8 + ": " + e);
                            P1.e(fileInputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            P1.e(fileInputStream);
                            throw th;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        AbstractC6635a.f("OG-ItemDetails", "Photo doesn't exist for server upload: " + a8);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final C6257g c8 = C6257g.c(getLayoutInflater());
        this.f33650S = new b(c8);
        setContentView(c8.b());
        L0();
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        this.f33646O = stringExtra;
        if (AbstractC6803e.o(stringExtra)) {
            AbstractC6635a.b("OG-ItemDetails", "Received request for item details without any containing list ID");
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("com.headcode.ourgroceries.ItemID");
        this.f33647P = stringExtra2;
        if (AbstractC6803e.o(stringExtra2)) {
            AbstractC6635a.b("OG-ItemDetails", "Received request for item details without any item ID");
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("com.headcode.ourgroceries.ScrollToPhoto", false);
        O1(c8);
        C5688z0 x7 = V0().x(this.f33646O);
        this.f33648Q = x7;
        if (x7 == null) {
            AbstractC6635a.f("OG-ItemDetails", "Containing list disappeared; finishing");
            finish();
            return;
        }
        int i8 = a.f33652b[x7.U().ordinal()];
        if (i8 == 1) {
            setTitle(M2.f34203v2);
        } else {
            if (i8 != 2) {
                AbstractC6635a.f("OG-ItemDetails", "Containing list has unrecognized type: " + this.f33648Q.U());
                finish();
                return;
            }
            setTitle(M2.f34187t2);
        }
        Z0 J7 = this.f33648Q.J(this.f33647P);
        this.f33649R = J7;
        if (J7 == null) {
            finish();
            return;
        }
        if (bundle == null) {
            this.f33650S.E(J7.E(), true);
            this.f33650S.F(this.f33649R.y());
            this.f33650S.I(this.f33649R.C());
            this.f33650S.D(this.f33649R.u());
            this.f33650S.H(Q1() ? this.f33649R.D() : this.f33646O);
            this.f33650S.C(this.f33649R.s());
            this.f33650S.G(this.f33649R.A());
        } else {
            this.f33650S.I(s5.r0.valueOf(bundle.getString("com.headcode.ourgroceries.android.ItemDetailsActivity.star")));
            this.f33650S.D(bundle.getString("com.headcode.ourgroceries.android.ItemDetailsActivity.category_id"));
            this.f33650S.H(bundle.getString("com.headcode.ourgroceries.android.ItemDetailsActivity.shopping_list_id"));
            this.f33650S.C(bundle.getString("com.headcode.ourgroceries.android.ItemDetailsActivity.barcode"));
            this.f33650S.G(bundle.getString("com.headcode.ourgroceries.android.ItemDetailsActivity.photo_id"));
        }
        this.f33650S.L();
        if (booleanExtra && bundle == null) {
            final ScrollView scrollView = c8.f39656r;
            scrollView.post(new Runnable() { // from class: com.headcode.ourgroceries.android.j0
                @Override // java.lang.Runnable
                public final void run() {
                    ItemDetailsActivity.f2(c8, scrollView);
                }
            });
        }
        if (Z0().U().f()) {
            M0();
        } else {
            N0();
            h2();
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        if (isFinishing()) {
            g2();
        }
        super.onDestroy();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.headcode.ourgroceries.android.ItemDetailsActivity.star", this.f33650S.z().name());
        bundle.putString("com.headcode.ourgroceries.android.ItemDetailsActivity.category_id", this.f33650S.u());
        bundle.putString("com.headcode.ourgroceries.android.ItemDetailsActivity.shopping_list_id", this.f33650S.y());
        bundle.putString("com.headcode.ourgroceries.android.ItemDetailsActivity.barcode", this.f33650S.t());
        bundle.putString("com.headcode.ourgroceries.android.ItemDetailsActivity.photo_id", this.f33650S.x());
    }
}
