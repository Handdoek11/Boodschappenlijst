package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC0922h;
import com.headcode.ourgroceries.android.C5536e3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o5.O;
import p5.C6395a;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public final class RecipeActivity extends Q0 implements O.a {

    /* renamed from: Y, reason: collision with root package name */
    private boolean f34403Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ArrayList f34404Z = new ArrayList(15);

    /* renamed from: a0, reason: collision with root package name */
    private int f34405a0 = -1;

    /* renamed from: b0, reason: collision with root package name */
    private Z0 f34406b0 = null;

    /* renamed from: c0, reason: collision with root package name */
    private final Set f34407c0 = new HashSet(15);

    /* renamed from: d0, reason: collision with root package name */
    private final List f34408d0 = new ArrayList(15);

    /* renamed from: e0, reason: collision with root package name */
    private final Map f34409e0 = new HashMap(15);

    /* renamed from: f0, reason: collision with root package name */
    private boolean f34410f0 = false;

    private C5688z0 a2(Z0 z02) {
        C5574j1 V02 = V0();
        C5688z0 x7 = V02.x(z02.D());
        if (x7 == null) {
            x7 = V02.O();
        }
        if (x7 == null) {
            this.f34406b0 = z02;
            try {
                o5.O.w2(Collections.singletonList(z02.t()), Collections.singletonList(z02.y()), V02.x(A2.f33140n0.s())).r2(getSupportFragmentManager(), "unused");
            } catch (IllegalStateException unused) {
                return null;
            }
        } else {
            b2(x7, z02);
        }
        return x7;
    }

    private Z0 b2(C5688z0 c5688z0, Z0 z02) {
        Z0 F02 = F0(c5688z0, z02);
        this.f34408d0.add(F02);
        this.f34409e0.put(c5688z0.T(), c5688z0);
        m5.D.j(Z0(), c5688z0, F02.t());
        return F02;
    }

    private void c2() {
        String string;
        if (this.f34405a0 == -1) {
            return;
        }
        while (this.f34405a0 < this.f34404Z.size()) {
            Z0 z02 = (Z0) this.f34404Z.get(this.f34405a0);
            this.f34405a0++;
            if (this.f34407c0.contains(z02.w()) && a2(z02) == null) {
                return;
            }
        }
        this.f34405a0 = -1;
        if (this.f34408d0.isEmpty() || this.f34409e0.isEmpty()) {
            return;
        }
        String W7 = this.f34409e0.size() == 1 ? ((C5688z0) this.f34409e0.values().iterator().next()).W() : null;
        int size = this.f34408d0.size();
        if (size == 1 && W7 != null) {
            string = getString(M2.f33915L2, ((Z0) this.f34408d0.get(0)).t(), W7);
        } else if (size == this.f34330P.size()) {
            String W8 = this.f34330P.W();
            string = W7 == null ? getString(M2.f33939O2, W8, Integer.valueOf(this.f34409e0.size())) : getString(M2.f33947P2, W8, W7);
        } else {
            string = W7 == null ? getString(M2.f33923M2, Integer.valueOf(size), Integer.valueOf(this.f34409e0.size())) : getString(M2.f33931N2, Integer.valueOf(size), W7);
        }
        V1.e(this.f34333S, string, true);
    }

    private void d2(Z0 z02, C5688z0 c5688z0) {
        V1.e(this.f34333S, getString(M2.f33915L2, z02.t(), c5688z0.W()), false);
    }

    @Override // o5.O.a
    public void B() {
        if (this.f34410f0) {
            return;
        }
        c2();
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void K(C5536e3.g gVar, Object obj) {
        Z0 J7;
        C5688z0 a22;
        if (getLifecycle().b() != AbstractC0922h.b.RESUMED) {
            AbstractC6635a.f("OG-RecipeActivity", "Ignoring tap because lifecycle state is " + getLifecycle().b());
            return;
        }
        if ((obj instanceof Z0) && (J7 = this.f34330P.J(((Z0) obj).w())) != null && (a22 = a2(J7)) != null) {
            d2(J7, a22);
        }
        if (obj instanceof p5.f) {
            AbstractC5625q.f(this, this.f34329O, true);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, com.headcode.ourgroceries.android.C5574j1.d
    public void P(C5688z0 c5688z0) {
        if (c5688z0 == null) {
            C5688z0 x7 = V0().x(this.f34329O);
            this.f34330P = x7;
            if (x7 == null) {
                finish();
                return;
            }
        } else if (!c5688z0.T().equals(this.f34329O) && c5688z0.U() != s5.Q.SHOPPING) {
            return;
        }
        setTitle(this.f34330P.W());
        this.f34404Z.clear();
        this.f34330P.v(this.f34404Z);
        Collections.sort(this.f34404Z);
        C6395a c6395a = new C6395a(this.f34330P.size() + 1);
        c6395a.b(this.f34404Z);
        if (!this.f34330P.X().isEmpty()) {
            c6395a.a(p5.c.g("recipe_notes", getString(M2.f34084g3)));
            c6395a.a(new p5.f(this.f34330P.T(), this.f34330P.X()));
        }
        if (c6395a.h() == 0) {
            this.f34338X.f39692g.setText(M2.f34036a3);
            this.f34338X.f39693h.setVisibility(8);
            this.f34338X.f39691f.setVisibility(0);
        } else {
            this.f34338X.f39693h.setVisibility(0);
            this.f34338X.f39691f.setVisibility(8);
        }
        this.f34332R.G0(c6395a, false);
        V1();
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2
    protected m5.p Q0() {
        return m5.p.RECIPE;
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.C5536e3.d
    public String b(C6395a c6395a, int i8, Z0 z02) {
        String G7 = V0().G(z02, null, this.f34403Y);
        String y7 = z02.y();
        if (y7.isEmpty()) {
            return G7;
        }
        if (G7 == null) {
            return y7;
        }
        return y7 + "\n" + G7;
    }

    @Override // o5.O.a
    public void n(C5688z0 c5688z0, List list, List list2) {
        C5574j1 V02 = V0();
        Z0 z02 = this.f34406b0;
        if (z02 != null) {
            Z0 D02 = V02.D0(this.f34330P, z02, c5688z0);
            this.f34406b0 = D02;
            b2(c5688z0, D02);
            if (this.f34405a0 == -1) {
                d2(this.f34406b0, c5688z0);
            }
        }
        this.f34406b0 = null;
    }

    @Override // com.headcode.ourgroceries.android.Q0, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        super.onActivityResult(i8, i9, intent);
        if (i8 != 1 || i9 != -1 || intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("com.headcode.ourgroceries.ItemIDs")) == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        this.f34407c0.clear();
        this.f34407c0.addAll(stringArrayListExtra);
        this.f34405a0 = 0;
        this.f34408d0.clear();
        this.f34409e0.clear();
        c2();
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34403Y = P1.C("en");
        P(null);
        C5688z0 c5688z0 = this.f34330P;
        if (c5688z0 != null) {
            Shortcuts.k(this, c5688z0);
        }
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.appcompat.app.AbstractActivityC0835d, androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        this.f34410f0 = true;
        super.onDestroy();
    }

    @Override // com.headcode.ourgroceries.android.Q0, com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != H2.f33533Q0) {
            return false;
        }
        if (this.f34404Z.isEmpty()) {
            V1.d(this.f34333S, M2.f34052c3, true);
        } else {
            AbstractC5625q.m(this, this.f34329O, null);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        getMenuInflater().inflate(K2.f33729c, menu);
        P1.g(this, menu);
        X1(menu);
        return true;
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f34405a0 = bundle.getInt("com.headcode.ourgroceries.android.RecipeActivity.RecipeItemIndex", -1);
        C5688z0 c5688z0 = this.f34330P;
        if (c5688z0 == null) {
            this.f34406b0 = null;
        } else {
            this.f34406b0 = c5688z0.J(bundle.getString("com.headcode.ourgroceries.android.RecipeActivity.ItemID"));
        }
        this.f34407c0.clear();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.headcode.ourgroceries.android.RecipeActivity.ApprovedItemIDs");
        if (stringArrayList != null) {
            this.f34407c0.addAll(stringArrayList);
        }
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.headcode.ourgroceries.android.RecipeActivity.RecipeItemIndex", this.f34405a0);
        Z0 z02 = this.f34406b0;
        if (z02 != null) {
            bundle.putString("com.headcode.ourgroceries.android.RecipeActivity.ItemID", z02.w());
        }
        bundle.putStringArrayList("com.headcode.ourgroceries.android.RecipeActivity.ApprovedItemIDs", new ArrayList<>(this.f34407c0));
    }

    @Override // o5.O.a
    public void x() {
    }
}
