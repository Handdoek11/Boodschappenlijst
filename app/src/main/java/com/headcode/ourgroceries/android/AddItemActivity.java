package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.AbstractC0922h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adadapted.android.sdk.core.keyword.KeywordInterceptMatcher;
import com.adadapted.android.sdk.core.keyword.Suggestion;
import com.google.android.material.snackbar.Snackbar;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import com.headcode.ourgroceries.android.C5587k6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import n5.C6253c;
import o5.c0;
import p5.C6395a;
import q5.AbstractC6635a;
import t5.AbstractC6803e;
import t5.AbstractC6804f;

/* loaded from: classes2.dex */
public final class AddItemActivity extends AbstractActivityC5575j2 implements TextWatcher, TextView.OnEditorActionListener, c0.a, C5536e3.d {

    /* renamed from: o0, reason: collision with root package name */
    private static final String f33228o0 = AbstractC6804f.a();

    /* renamed from: p0, reason: collision with root package name */
    private static final String f33229p0 = AbstractC6804f.a();

    /* renamed from: q0, reason: collision with root package name */
    private static final String f33230q0 = AbstractC6804f.a();

    /* renamed from: O, reason: collision with root package name */
    private boolean f33231O;

    /* renamed from: P, reason: collision with root package name */
    private EditText f33232P;

    /* renamed from: Q, reason: collision with root package name */
    private Button f33233Q;

    /* renamed from: R, reason: collision with root package name */
    private RecyclerView f33234R;

    /* renamed from: S, reason: collision with root package name */
    private View f33235S;

    /* renamed from: T, reason: collision with root package name */
    private C5536e3 f33236T = null;

    /* renamed from: U, reason: collision with root package name */
    private String f33237U = null;

    /* renamed from: V, reason: collision with root package name */
    private String f33238V = null;

    /* renamed from: W, reason: collision with root package name */
    private String f33239W = null;

    /* renamed from: X, reason: collision with root package name */
    private final String f33240X = AbstractC6804f.a();

    /* renamed from: Y, reason: collision with root package name */
    private C5688z0 f33241Y = null;

    /* renamed from: Z, reason: collision with root package name */
    private C5688z0 f33242Z = null;

    /* renamed from: a0, reason: collision with root package name */
    private String f33243a0 = "";

    /* renamed from: b0, reason: collision with root package name */
    private Y f33244b0;

    /* renamed from: c0, reason: collision with root package name */
    private String[] f33245c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f33246d0;

    /* renamed from: e0, reason: collision with root package name */
    private String f33247e0;

    /* renamed from: f0, reason: collision with root package name */
    private String f33248f0;

    /* renamed from: g0, reason: collision with root package name */
    private String f33249g0;

    /* renamed from: h0, reason: collision with root package name */
    private String f33250h0;

    /* renamed from: i0, reason: collision with root package name */
    private String f33251i0;

    /* renamed from: j0, reason: collision with root package name */
    private String f33252j0;

    /* renamed from: k0, reason: collision with root package name */
    private Suggestion f33253k0;

    /* renamed from: l0, reason: collision with root package name */
    private final HashMap f33254l0;

    /* renamed from: m0, reason: collision with root package name */
    private final HashMap f33255m0;

    /* renamed from: n0, reason: collision with root package name */
    private C6253c f33256n0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33257a;

        static {
            int[] iArr = new int[A2.b.values().length];
            f33257a = iArr;
            try {
                iArr[A2.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33257a[A2.b.FIRST_WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33257a[A2.b.EVERY_WORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f33258c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        private final int f33259a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33260b;

        public b(int i8, int i9) {
            this.f33259a = i8;
            this.f33260b = i9;
        }

        public int a() {
            return this.f33260b;
        }

        public int b() {
            return this.f33259a + this.f33260b;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f33261a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33262b;

        public c(String str, String str2) {
            this.f33261a = str;
            this.f33262b = str2;
        }

        public static c a(Z0 z02) {
            return new c(z02.E(), z02.y());
        }

        public String b() {
            return this.f33261a;
        }

        public String c() {
            return this.f33262b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f33261a.equals(cVar.f33261a) && this.f33262b.equals(cVar.f33262b);
        }

        public int hashCode() {
            return Objects.hash(this.f33261a, this.f33262b);
        }
    }

    private enum d {
        RETURN_KEY,
        ADD_BUTTON,
        TAPPED_ROW
    }

    public AddItemActivity() {
        Y y7 = new Y(this.f33243a0);
        this.f33244b0 = y7;
        this.f33245c0 = y7.b(this.f33243a0);
        this.f33246d0 = false;
        this.f33254l0 = new HashMap();
        this.f33255m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[PHI: r6
  0x0092: PHI (r6v4 java.lang.String) = 
  (r6v0 java.lang.String)
  (r6v0 java.lang.String)
  (r6v1 java.lang.String)
  (r6v2 java.lang.String)
  (r6v0 java.lang.String)
 binds: [B:21:0x0046, B:23:0x004e, B:28:0x006c, B:35:0x008e, B:19:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E1(java.lang.String r9, java.lang.String r10, com.headcode.ourgroceries.android.AddItemActivity.d r11) {
        /*
            r8 = this;
            com.headcode.ourgroceries.android.j1 r0 = r8.V0()
            java.lang.String r9 = r9.trim()
            java.lang.String r10 = r10.trim()
            int r1 = r11.ordinal()
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 == r2) goto L19
            r3 = 2
            if (r1 == r3) goto L19
            goto L2c
        L19:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L2c
            return
        L20:
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L9d
            boolean r1 = r8.f33246d0
            if (r1 == 0) goto L2c
            goto L9d
        L2c:
            java.lang.String r1 = t5.AbstractC6803e.k(r9)
            com.headcode.ourgroceries.android.A2 r3 = com.headcode.ourgroceries.android.A2.f33140n0
            s5.l r3 = r3.e()
            s5.l r4 = s5.EnumC6746l.AC_ASK
            r5 = 0
            r6 = 0
            if (r3 == r4) goto L40
            s5.l r7 = s5.EnumC6746l.AC_GUESS
            if (r3 != r7) goto L92
        L40:
            com.headcode.ourgroceries.android.z0 r7 = r8.f33241Y
            boolean r7 = r8.W1(r7, r1, r10)
            if (r7 != 0) goto L92
            com.headcode.ourgroceries.android.z0 r7 = r8.f33242Z
            boolean r7 = r8.W1(r7, r1, r10)
            if (r7 == 0) goto L51
            goto L92
        L51:
            if (r3 != r4) goto L54
            goto L93
        L54:
            com.headcode.ourgroceries.android.z0 r3 = r0.D()
            java.util.Map r3 = r3.g0()
            com.headcode.ourgroceries.android.OurApplication r4 = r8.X0()
            com.headcode.ourgroceries.android.T r4 = r4.g()
            com.headcode.ourgroceries.android.U r1 = r4.b(r1, r3)
            java.lang.String r6 = r1.b()
            if (r6 != 0) goto L92
            java.util.List r3 = r1.a()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L79
            goto L93
        L79:
            java.util.List r1 = r1.a()
            java.lang.Object r1 = r1.get(r5)
            com.headcode.ourgroceries.android.U$a r1 = (com.headcode.ourgroceries.android.U.a) r1
            java.lang.String r1 = r1.b()
            com.headcode.ourgroceries.android.Z0 r0 = r0.j(r1)
            if (r0 != 0) goto L8e
            goto L93
        L8e:
            java.lang.String r6 = r0.w()
        L92:
            r2 = r5
        L93:
            if (r2 == 0) goto L99
            r8.F1(r9, r10, r11)
            goto L9c
        L99:
            r8.G1(r9, r10, r6, r11)
        L9c:
            return
        L9d:
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.AddItemActivity.E1(java.lang.String, java.lang.String, com.headcode.ourgroceries.android.AddItemActivity$d):void");
    }

    private void F1(String str, String str2, d dVar) {
        try {
            o5.c0.A2(str, str2, dVar.name()).r2(getSupportFragmentManager(), "unused");
        } catch (IllegalStateException e8) {
            AbstractC6635a.f("OG-AddItemActivity", "Got exception showing dialog box: " + e8);
        }
    }

    private void G1(String str, String str2, String str3, d dVar) {
        C5574j1 V02 = V0();
        Z0 l8 = V02.l(this.f33241Y, str, str2);
        if (str3 != null) {
            l8 = V02.I0(this.f33241Y, l8, str3);
        }
        String str4 = this.f33238V;
        if (str4 != null) {
            l8 = V02.G0(this.f33241Y, l8, str4);
        }
        AbstractC5673x.a(AbstractC6803e.o(this.f33243a0) ? "addItemNoFilter" : "addItemFilter");
        m5.D.j(Z0(), this.f33241Y, str);
        P0().l(str);
        K1(l8, dVar);
    }

    private b H1(c cVar) {
        b bVar = (b) this.f33255m0.get(cVar);
        if (bVar != null) {
            return bVar;
        }
        String[] strArr = this.f33245c0;
        if (strArr.length == 0) {
            return b.f33258c;
        }
        String[] b22 = b2(cVar.b());
        String[] b23 = b2(cVar.c());
        int i8 = 0;
        int i9 = 0;
        for (String str : strArr) {
            if (Z.b(str, b22) || Z.b(str, b23)) {
                i8++;
            } else {
                if (Z.a(str, b22) || Z.a(str, b23)) {
                }
            }
            i9++;
        }
        b bVar2 = new b(i8, i9);
        this.f33255m0.put(cVar, bVar2);
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    private void I1() {
        int i8;
        boolean z7;
        Suggestion next;
        C5688z0 D7 = V0().D();
        final boolean z8 = this.f33239W != null;
        boolean z9 = M1().equals(this.f33252j0) && !z8;
        final boolean equals = P1().equals(this.f33248f0);
        final Comparator comparator = equals ? Z0.f34623w : Z0.f34617B;
        if (z8 || !equals) {
            comparator = new Comparator() { // from class: com.headcode.ourgroceries.android.u
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return this.f35040o.Q1(comparator, (Z0) obj, (Z0) obj2);
                }
            };
        }
        if (!z9) {
            D7 = null;
        }
        B0 b02 = new B0(D7, comparator);
        HashSet hashSet = new HashSet();
        C5688z0 c5688z0 = this.f33242Z;
        if (c5688z0 != null) {
            int size = c5688z0.size();
            i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Z0 e02 = this.f33242Z.e0(i9);
                if (J1(c.a(e02))) {
                    b02.a(e02);
                    hashSet.add(e02.E());
                    i8++;
                }
            }
        } else {
            i8 = 0;
        }
        A2.b g8 = A2.f33140n0.g();
        Locale locale = Locale.getDefault();
        String[] stringArray = getResources().getStringArray(B2.f33289c);
        ArrayList arrayList = new ArrayList();
        int length = stringArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = stringArray[i10];
            if (J1(new c(str, ""))) {
                int i11 = a.f33257a[g8.ordinal()];
                if (i11 == 2) {
                    str = AbstractC6803e.g(str, locale);
                } else if (i11 == 3) {
                    str = AbstractC6803e.f(str, locale);
                }
                if (!hashSet.contains(str)) {
                    arrayList.add(str);
                    i8++;
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.headcode.ourgroceries.android.v
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f35052o.R1(z8, equals, (String) obj, (String) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        if (!z8 && this.f33238V == null) {
            Iterator it = V0().J().iterator();
            while (it.hasNext()) {
                C5688z0 c5688z02 = (C5688z0) it.next();
                if (c5688z02.U() == s5.Q.RECIPE && c5688z02.size() > 0 && c5688z02 != this.f33241Y && J1(new c(c5688z02.W(), ""))) {
                    arrayList2.add(c5688z02);
                    i8++;
                }
            }
            Collections.sort(arrayList2);
        }
        C6395a c6395a = new C6395a(i8);
        this.f33253k0 = null;
        if (!Z0().U().f() && A2.f33140n0.U(s5.G.FEATURE_AA_KEYWORD_INTERCEPT)) {
            Set<Suggestion> match = KeywordInterceptMatcher.INSTANCE.match(this.f33243a0);
            if (!match.isEmpty() && (next = match.iterator().next()) != null && !AbstractC6803e.o(next.getName())) {
                c6395a.l(null, false);
                c6395a.a(new Z0(next.getName(), f33230q0));
                this.f33253k0 = next;
                next.presented();
            }
        }
        if (z8) {
            c6395a.l(p5.c.g("barcode_scan", null), false);
            c6395a.a(new Z0(this.f33239W, this.f33240X));
        }
        for (C5565i0 c5565i0 : b02.d()) {
            Z0 z02 = (Z0) c5565i0.a();
            c6395a.l(p5.c.g(z02.w(), c5565i0.g() ? z02.E() : null), false);
            c6395a.b(c5565i0.c());
        }
        if (!arrayList.isEmpty()) {
            if (a2()) {
                c6395a.l(c6395a.h() != 0 ? p5.c.f(f33228o0, getString(M2.f33872G)) : null, false);
                c6395a.b(arrayList);
                c6395a.a(new p5.g("hide_other_suggestions", getString(M2.f33824A)));
            } else {
                c6395a.a(new p5.g("show_other_suggestions", getString(M2.f33888I)));
            }
        }
        if (arrayList2.isEmpty()) {
            z7 = false;
        } else {
            z7 = false;
            c6395a.l(p5.c.f(f33229p0, getString(M2.f34092h3)), false);
            c6395a.b(arrayList2);
        }
        this.f33236T.G0(c6395a, z7);
        this.f33234R.setVisibility(i8 != 0 ? z7 : 8);
        this.f33235S.setVisibility(i8 != 0 ? 8 : z7);
    }

    private boolean J1(c cVar) {
        b H12 = H1(cVar);
        return this.f33239W == null ? H12.a() == this.f33245c0.length : H12.a() > 0;
    }

    private void K1(Z0 z02, d dVar) {
        C5688z0 c5688z0;
        if (!L1() || this.f33238V != null) {
            if (z02 != null) {
                Intent intent = new Intent();
                intent.putExtra("com.headcode.ourgroceries.ItemID", z02.w());
                setResult(-1, intent);
            }
            finish();
            return;
        }
        if (dVar == d.TAPPED_ROW) {
            this.f33232P.selectAll();
            this.f33246d0 = true;
        } else {
            this.f33232P.setText("");
            this.f33234R.u1(0);
        }
        l1();
        if (z02 == null || (c5688z0 = this.f33241Y) == null) {
            return;
        }
        Q0.U1(this, this.f33234R, c5688z0, z02);
    }

    private boolean L1() {
        return S0().getBoolean(getString(M2.f33944P), false);
    }

    private String M1() {
        return S0().getString(this.f33250h0, this.f33251i0);
    }

    private void N1() {
        AbstractC5673x.a("addItemSpeak");
        Shortcuts.b(this, this.f33241Y);
        AbstractC5625q.v(this, getString(M2.f33936O));
    }

    private boolean O1() {
        return S0().getBoolean(getString(M2.f34181s4), true);
    }

    private String P1() {
        return S0().getString(this.f33247e0, this.f33249g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int Q1(Comparator comparator, Z0 z02, Z0 z03) {
        int i8 = -Integer.compare(H1(c.a(z02)).b(), H1(c.a(z03)).b());
        return i8 != 0 ? i8 : comparator.compare(z02, z03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int R1(boolean z7, boolean z8, String str, String str2) {
        if (z7 || !z8) {
            int i8 = -Integer.compare(H1(new c(str, "")).b(), H1(new c(str2, "")).b());
            if (i8 != 0) {
                return i8;
            }
        }
        if (z8) {
            return Z0.f34622v.compare(str, str2);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1(Z0 z02, String str, View view) {
        V0().S0(this.f33242Z, z02);
        Snackbar.o0(this.f33234R, getString(M2.f33928N, str), 0).Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(View view) {
        N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1(View view) {
        E1(this.f33232P.getText().toString(), "", d.ADD_BUTTON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1() {
        if (this.f33233Q.getWidth() < this.f33233Q.getHeight()) {
            Button button = this.f33233Q;
            button.setMinimumWidth(button.getHeight());
            this.f33233Q.requestLayout();
        }
    }

    private boolean W1(C5688z0 c5688z0, String str, String str2) {
        if (c5688z0 == null) {
            return false;
        }
        Iterator it = c5688z0.O(str, str2).iterator();
        while (it.hasNext()) {
            if (!((Z0) it.next()).u().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void X1(String str) {
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.equals(this.f33243a0)) {
            return;
        }
        this.f33243a0 = trim;
        Y y7 = new Y(this.f33243a0);
        if (!y7.equals(this.f33244b0)) {
            this.f33254l0.clear();
        }
        this.f33244b0 = y7;
        this.f33245c0 = b2(this.f33243a0);
        this.f33255m0.clear();
        I1();
    }

    private void Y1(String str) {
        if (str == null) {
            str = "";
        }
        this.f33232P.setText(str);
        this.f33232P.requestFocus();
        this.f33232P.setSelection(str.length());
    }

    private void Z1(boolean z7) {
        S0().edit().putBoolean(getString(M2.f34189t4), z7).apply();
    }

    private boolean a2() {
        return S0().getBoolean(getString(M2.f34189t4), true);
    }

    private String[] b2(String str) {
        String[] strArr = (String[]) this.f33254l0.get(str);
        if (strArr != null) {
            return strArr;
        }
        String[] b8 = this.f33244b0.b(str);
        this.f33254l0.put(str, b8);
        return b8;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int A(C6395a c6395a, int i8, Z0 z02) {
        if (this.f33239W == null || i8 != 0) {
            return z02.w().equals(f33230q0) ? 6 : 2;
        }
        return 5;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public String D(C6395a c6395a, int i8, Object obj) {
        return obj instanceof String ? Integer.toString(((String) obj).hashCode()) : obj instanceof C5688z0 ? ((C5688z0) obj).T() : AbstractC5544f3.g(this, c6395a, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public boolean E(Object obj) {
        if (obj instanceof Z0) {
            Y1(((Z0) obj).E());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        Y1((String) obj);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean F(C6395a c6395a, int i8, Z0 z02) {
        return AbstractC5544f3.i(this, c6395a, i8, z02);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int G(C6395a c6395a, int i8, Object obj) {
        if (obj instanceof C5688z0) {
            return 5;
        }
        return AbstractC5544f3.c(this, c6395a, i8, obj);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void H() {
        AbstractC5544f3.o(this);
    }

    @Override // o5.c0.a
    public void I(String str, String str2, String str3, Z0 z02) {
        d dVar;
        try {
            dVar = d.valueOf(str3);
        } catch (IllegalArgumentException | NullPointerException e8) {
            AbstractC6635a.b("OG-AddItemActivity", "Can't decode whence name \"" + str3 + "\": " + e8.getMessage());
            dVar = d.RETURN_KEY;
        }
        G1(str, str2, z02 == null ? null : z02.w(), dVar);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean J(int i8) {
        return AbstractC5544f3.s(this, i8);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void K(C5536e3.g gVar, Object obj) {
        Suggestion suggestion;
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-AddItemActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (obj instanceof Z0) {
            Z0 z02 = (Z0) obj;
            if (z02.w().equals(f33230q0) && (suggestion = this.f33253k0) != null) {
                suggestion.selected();
            }
            AbstractC5673x.a("addItemAddMaster");
            E1(z02.E(), z02.y(), d.TAPPED_ROW);
            return;
        }
        if (obj instanceof String) {
            AbstractC5673x.a("addItemAddSugg");
            E1((String) obj, "", d.TAPPED_ROW);
            return;
        }
        if (!(obj instanceof p5.g)) {
            if (obj instanceof C5688z0) {
                AbstractC5673x.a("addItemTapRecipe");
                AbstractC5625q.m(this, ((C5688z0) obj).T(), this.f33237U);
                return;
            }
            return;
        }
        p5.g gVar2 = (p5.g) obj;
        if (gVar2.a().equals("hide_other_suggestions")) {
            Z1(false);
            I1();
        } else if (gVar2.a().equals("show_other_suggestions")) {
            Z1(true);
            I1();
        } else {
            AbstractC6635a.b("OG-AddItemActivity", "Unknown note ID: " + gVar2.a());
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
    public String N(C6395a c6395a, int i8, String str) {
        C5688z0 c5688z0 = this.f33241Y;
        if (c5688z0 != null) {
            if (c5688z0.U() == s5.Q.SHOPPING) {
                return V0().H(str, "", this.f33241Y, this.f33231O);
            }
            if (this.f33241Y.U() == s5.Q.RECIPE) {
                return V0().F(str, "", this.f33241Y);
            }
        }
        return null;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void O(C6395a c6395a, int i8) {
        AbstractC5544f3.m(this, c6395a, i8);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        if (c5688z0 != null) {
            if (c5688z0.U() == s5.Q.MASTER) {
                this.f33242Z = c5688z0;
            } else if (c5688z0.U() != s5.Q.SHOPPING && c5688z0.U() != s5.Q.RECIPE && c5688z0.U() != s5.Q.CATEGORY) {
                return;
            }
        }
        C5688z0 x7 = V0().x(this.f33237U);
        this.f33241Y = x7;
        if (x7 == null) {
            AbstractC6635a.f("OG-AddItemActivity", "Target list disappeared; finishing");
            finish();
            return;
        }
        if (this.f33238V == null) {
            setTitle(getString(M2.f33904K, x7.W()));
        } else if (this.f33239W == null) {
            setTitle(M2.f33920M);
            getSupportActionBar().w(M2.f33896J);
        } else {
            setTitle(M2.f33912L);
        }
        if (this.f33242Z == null) {
            this.f33242Z = V0().L();
        }
        I1();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        X1(editable.toString());
        this.f33246d0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // com.headcode.ourgroceries.android.C5536e3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(p5.C6395a r2, int r3, com.headcode.ourgroceries.android.Z0 r4) {
        /*
            r1 = this;
            com.headcode.ourgroceries.android.z0 r2 = r1.f33241Y
            if (r2 == 0) goto L2e
            s5.Q r2 = r2.U()
            s5.Q r3 = s5.Q.SHOPPING
            if (r2 != r3) goto L19
            com.headcode.ourgroceries.android.j1 r2 = r1.V0()
            com.headcode.ourgroceries.android.z0 r3 = r1.f33241Y
            boolean r0 = r1.f33231O
            java.lang.String r2 = r2.G(r4, r3, r0)
            goto L2f
        L19:
            com.headcode.ourgroceries.android.z0 r2 = r1.f33241Y
            s5.Q r2 = r2.U()
            s5.Q r3 = s5.Q.RECIPE
            if (r2 != r3) goto L2e
            com.headcode.ourgroceries.android.j1 r2 = r1.V0()
            com.headcode.ourgroceries.android.z0 r3 = r1.f33241Y
            java.lang.String r2 = r2.E(r4, r3)
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.String r3 = r4.y()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L51
            if (r2 != 0) goto L3d
            r2 = r3
            goto L51
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "\n"
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.headcode.ourgroceries.android.AddItemActivity.b(p5.a, int, com.headcode.ourgroceries.android.Z0):java.lang.String");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // android.app.Activity
    public void finish() {
        a1(this.f33232P);
        super.finish();
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void g(Object obj) {
        if (obj instanceof Z0) {
            AbstractC5662v2.l(this, (Z0) obj, "addItem");
        } else {
            AbstractC5544f3.r(this, obj);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    public void j1(C5587k6.b bVar) {
        super.j1(bVar);
        if (bVar.f34866c.f()) {
            M0();
        } else {
            N0();
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.h(this, c6395a, i8, str);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 != -1 || intent == null) {
            return;
        }
        if (i8 != 1) {
            AbstractC5673x.a("addItemSpeakResult");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            AbstractC5673x.a("addItemSpeakValid");
            Y1(stringArrayListExtra.get(0).trim());
            return;
        }
        String stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ListID");
        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.headcode.ourgroceries.ItemIDs");
        if (stringExtra == null || stringArrayListExtra2 == null) {
            return;
        }
        C5688z0 x7 = V0().x(stringExtra);
        ArrayList arrayList = new ArrayList(stringArrayListExtra2.size());
        if (x7 != null) {
            HashSet hashSet = new HashSet(stringArrayListExtra2);
            Iterator it = x7.iterator();
            while (it.hasNext()) {
                Z0 z02 = (Z0) it.next();
                if (hashSet.contains(z02.w())) {
                    arrayList.add(F0(this.f33241Y, z02));
                    AbstractC5673x.a("addItemFromRecipe");
                    m5.D.j(Z0(), this.f33241Y, z02.E());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                V1.e(this.f33234R, getString(M2.f33907K2, ((Z0) arrayList.get(0)).t()), true);
            } else {
                V1.e(this.f33234R, getString(M2.f33899J2, Integer.valueOf(arrayList.size())), true);
            }
        }
        K1(null, d.TAPPED_ROW);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6253c c8 = C6253c.c(getLayoutInflater());
        this.f33256n0 = c8;
        setContentView(c8.b());
        L0();
        this.f33231O = P1.C("en");
        String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        this.f33237U = stringExtra;
        if (stringExtra == null || stringExtra.isEmpty()) {
            AbstractC6635a.b("OG-AddItemActivity", "Received request to add item without any target list ID");
            finish();
            return;
        }
        this.f33238V = getIntent().getStringExtra("com.headcode.ourgroceries.Barcode");
        this.f33239W = AbstractC6803e.v(getIntent().getStringExtra("com.headcode.ourgroceries.Value"));
        boolean z7 = P1.z(this);
        if (z7) {
            this.f33256n0.f39618f.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34990o.T1(view);
                }
            });
        } else {
            this.f33256n0.f39618f.setVisibility(8);
        }
        EditText editText = this.f33256n0.f39616d;
        this.f33232P = editText;
        editText.addTextChangedListener(this);
        this.f33232P.setOnEditorActionListener(this);
        this.f33232P.setInputType(177 | R0());
        this.f33232P.setImeOptions((this.f33232P.getImeOptions() & (-256)) | 6);
        Button button = this.f33256n0.f39614b;
        this.f33233Q = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35004o.U1(view);
            }
        });
        this.f33233Q.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.headcode.ourgroceries.android.t
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f35017o.V1();
            }
        });
        this.f33234R = this.f33256n0.f39617e;
        this.f33234R.setLayoutManager(new LinearLayoutManager(this));
        C5536e3 c5536e3 = new C5536e3(this, this);
        this.f33236T = c5536e3;
        this.f33234R.setAdapter(c5536e3);
        this.f33235S = this.f33256n0.f39615c;
        C5536e3 c5536e32 = this.f33236T;
        Objects.requireNonNull(c5536e32);
        this.f33234R.j(new C5643s4(this, c5536e32.new f()));
        this.f33247e0 = getString(M2.f34078f5);
        this.f33248f0 = getString(M2.f34086g5);
        this.f33249g0 = getString(M2.f34094h5);
        this.f33250h0 = getString(M2.f34002W1);
        this.f33251i0 = getString(M2.f33994V1);
        this.f33252j0 = getString(M2.f33986U1);
        String str = this.f33239W;
        if (str != null) {
            Y1(str);
        }
        P(null);
        if (this.f33241Y != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("com.headcode.ourgroceries.AddByVoice", false);
            if (z7 && booleanExtra) {
                N1();
            } else {
                Shortcuts.c(this, this.f33241Y);
            }
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC6635a.a("OG-AddItemActivity", "actionId=" + i8 + "; event=" + keyEvent);
        if (keyEvent != null && keyEvent.getAction() == 1) {
            return true;
        }
        E1(textView.getText().toString(), "", d.RETURN_KEY);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractActivityC0835d, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null && O1()) {
            s1(this.f33232P);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void r(Object obj, boolean z7) {
        AbstractC5544f3.k(this, obj, z7);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public boolean s(C6395a c6395a, C5536e3.g gVar, int i8, Object obj) {
        if (!(obj instanceof C5688z0)) {
            return AbstractC5544f3.a(this, c6395a, gVar, i8, obj);
        }
        gVar.f34712F.setText(((C5688z0) obj).W());
        gVar.f34713G.setText(M2.f33880H);
        gVar.f34713G.setVisibility(0);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void t(C6395a c6395a, int i8, int i9) {
        AbstractC5544f3.q(this, c6395a, i8, i9);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void v(Object obj) {
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-AddItemActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if (obj instanceof Z0) {
            final Z0 z02 = (Z0) obj;
            if (z02.w().equals(f33230q0)) {
                AbstractC5625q.w(this);
                return;
            }
            final String E7 = z02.E();
            V0().v0(this.f33242Z, z02);
            Snackbar.o0(this.f33234R, getString(M2.f34232z, E7), 0).q0(M2.f33954Q1, new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f35090o.S1(z02, E7, view);
                }
            }).Y();
        }
    }

    @Override // o5.c0.a
    public void y() {
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void z(Object obj, ContextMenu contextMenu) {
        AbstractC5544f3.l(this, obj, contextMenu);
    }
}
