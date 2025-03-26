package com.headcode.ourgroceries.android;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.ContextMenu;
import androidx.appcompat.app.AbstractC0832a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import n5.C6261k;
import p5.C6395a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class ListPickerActivity extends AbstractActivityC5575j2 {

    /* renamed from: O, reason: collision with root package name */
    private int f33790O = 0;

    /* renamed from: P, reason: collision with root package name */
    private boolean f33791P;

    /* renamed from: Q, reason: collision with root package name */
    private String f33792Q;

    /* renamed from: R, reason: collision with root package name */
    private C5688z0 f33793R;

    /* renamed from: S, reason: collision with root package name */
    private String[] f33794S;

    /* renamed from: T, reason: collision with root package name */
    private int f33795T;

    /* renamed from: U, reason: collision with root package name */
    private C5536e3 f33796U;

    class a implements AbstractC6803e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f33797a;

        a(SpannableStringBuilder spannableStringBuilder) {
            this.f33797a = spannableStringBuilder;
        }

        @Override // t5.AbstractC6803e.b
        public void a(String str) {
            this.f33797a.append((CharSequence) str);
        }

        @Override // t5.AbstractC6803e.b
        public void b(String str) {
            this.f33797a.append(str, new StyleSpan(1), 33);
        }
    }

    private final class b implements C5536e3.d {
        private b() {
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ int A(C6395a c6395a, int i8, Z0 z02) {
            return AbstractC5544f3.d(this, c6395a, i8, z02);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ String D(C6395a c6395a, int i8, Object obj) {
            return AbstractC5544f3.g(this, c6395a, i8, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean E(Object obj) {
            return AbstractC5544f3.p(this, obj);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean F(C6395a c6395a, int i8, Z0 z02) {
            return AbstractC5544f3.i(this, c6395a, i8, z02);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ int G(C6395a c6395a, int i8, Object obj) {
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
            if (obj instanceof p5.e) {
                p5.e eVar = (p5.e) obj;
                ListPickerActivity.this.E1(eVar.b(), eVar.d());
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
        public boolean m(C6395a c6395a, int i8, String str) {
            return AbstractC6803e.o(ListPickerActivity.this.f33792Q) ? ListPickerActivity.this.f33793R != null && ListPickerActivity.this.f33793R.T().equals(str) : ListPickerActivity.this.f33792Q.equals(str);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ void r(Object obj, boolean z7) {
            AbstractC5544f3.k(this, obj, z7);
        }

        @Override // com.headcode.ourgroceries.android.C5536e3.d
        public /* synthetic */ boolean s(C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
            return AbstractC5544f3.a(this, c6395a, gVar, i8, obj);
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

        /* synthetic */ b(ListPickerActivity listPickerActivity, a aVar) {
            this();
        }
    }

    public static String B1(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("com.headcode.ourgroceries.ListID");
    }

    private boolean C1() {
        return (this.f33795T == 0 || this.f33794S == null) ? false : true;
    }

    private boolean D1() {
        return this.f33790O != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(String str, String str2) {
        this.f33792Q = str;
        C5536e3 c5536e3 = this.f33796U;
        if (c5536e3 != null) {
            c5536e3.J();
        }
        if (C1()) {
            m5.D.r(this.f33795T, str);
            this.f33795T = 0;
            this.f33794S = null;
            setResult(-1);
        } else {
            Intent intent = new Intent();
            if (D1()) {
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
                OurAppWidgetProvider.h(this, this.f33790O, str, str2);
                OurAppWidgetProvider.k(this, appWidgetManager, this.f33790O);
                OurAppWidgetProvider.m(this, this.f33790O);
                intent.putExtra("appWidgetId", this.f33790O);
            } else {
                C5688z0 c5688z0 = this.f33793R;
                if (c5688z0 != null && c5688z0.T().equals(str)) {
                    str = "";
                }
                intent.putExtra("com.headcode.ourgroceries.ListID", str);
            }
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected boolean G0() {
        return !D1();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i8 = extras.getInt("appWidgetId", 0);
            this.f33790O = i8;
            this.f33791P = OurAppWidgetProvider.f(this, i8);
        } else {
            this.f33790O = 0;
        }
        this.f33792Q = intent.getStringExtra("com.headcode.ourgroceries.ListID");
        String stringExtra = intent.getStringExtra("com.headcode.ourgroceries.PseudoRow");
        String stringExtra2 = intent.getStringExtra("com.headcode.ourgroceries.ImageUrl");
        this.f33794S = intent.getStringArrayExtra("com.headcode.ourgroceries.Items");
        this.f33795T = intent.getIntExtra("com.headcode.ourgroceries.AdAdaptedCounter", 0);
        C6261k c8 = C6261k.c(getLayoutInflater());
        setContentView(c8.b());
        L0();
        if (stringExtra2 == null) {
            c8.f39682e.setVisibility(8);
        } else {
            c8.f39682e.setVisibility(0);
            ((com.bumptech.glide.j) com.bumptech.glide.b.u(this).t(stringExtra2).j0(new com.bumptech.glide.load.resource.bitmap.F(P1.i(20)))).x0(new C5557h0(c8.f39682e));
        }
        if (this.f33794S == null) {
            c8.f39685h.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(C1() ? this.f33794S.length == 1 ? M2.f34209w0 : M2.f34201v0 : M2.f34193u0));
            sb.append(":");
            String sb2 = sb.toString();
            int indexOf = sb2.indexOf("%s");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            AbstractC6803e.s(new a(spannableStringBuilder), Arrays.asList(this.f33794S), Locale.getDefault());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2);
            spannableStringBuilder2.replace(indexOf, indexOf + 2, (CharSequence) spannableStringBuilder);
            c8.f39685h.setText(spannableStringBuilder2);
            c8.f39685h.setVisibility(0);
        }
        RecyclerView recyclerView = c8.f39679b;
        ArrayList arrayList = new ArrayList(16);
        C5574j1 V02 = V0();
        s5.Q q8 = s5.Q.SHOPPING;
        V02.P(arrayList, q8);
        if (arrayList.isEmpty()) {
            finish();
            return;
        }
        if (arrayList.size() == 1 && D1() && this.f33791P) {
            C5688z0 c5688z0 = (C5688z0) arrayList.get(0);
            E1(c5688z0.T(), c5688z0.W());
            return;
        }
        if (stringExtra != null) {
            C5688z0 c5688z02 = new C5688z0(q8, stringExtra);
            this.f33793R = c5688z02;
            arrayList.add(0, c5688z02);
        }
        C5536e3 c5536e3 = new C5536e3(this, new b(this, null));
        this.f33796U = c5536e3;
        recyclerView.setAdapter(c5536e3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C5536e3 c5536e32 = this.f33796U;
        Objects.requireNonNull(c5536e32);
        recyclerView.j(new C5643s4(this, c5536e32.new f()));
        if (this.f33792Q != null) {
            this.f33796U.m0(this);
        }
        C6395a c6395a = new C6395a(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c6395a.a(p5.e.f((C5688z0) it.next()));
        }
        this.f33796U.G0(c6395a, true);
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (D1()) {
                supportActionBar.y(M2.f33889I0);
                supportActionBar.u(G2.f33459g);
            } else {
                supportActionBar.y(M2.f33891I2);
            }
            if (this.f33794S != null) {
                supportActionBar.u(G2.f33459g);
            }
        }
        c8.f39680c.setVisibility(8);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        if (C1()) {
            AbstractC5673x.a("addToListAskCanceled");
            m5.D.r(this.f33795T, null);
            this.f33795T = 0;
        }
        super.onDestroy();
    }
}
