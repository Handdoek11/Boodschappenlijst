package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n5.C6258h;
import p5.C6395a;

/* loaded from: classes2.dex */
public class ItemSelectorActivity extends AbstractActivityC5575j2 implements C5536e3.d {

    /* renamed from: O, reason: collision with root package name */
    private C5688z0 f33666O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f33667P;

    /* renamed from: Q, reason: collision with root package name */
    private final Set f33668Q = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(View view) {
        setResult(0, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(String str, View view) {
        Intent intent = new Intent();
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putStringArrayListExtra("com.headcode.ourgroceries.ItemIDs", new ArrayList<>(this.f33668Q));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int D1(C5688z0 c5688z0, A0 a02, A0 a03) {
        C5688z0 c5688z02 = (C5688z0) a02.a();
        C5688z0 c5688z03 = (C5688z0) a03.a();
        int compare = Boolean.compare(c5688z02 == c5688z0, c5688z03 == c5688z0);
        return compare != 0 ? compare : c5688z02.compareTo(c5688z03);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int A(C6395a c6395a, int i8, Z0 z02) {
        return 8;
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
    public boolean F(C6395a c6395a, int i8, Z0 z02) {
        return this.f33668Q.contains(z02.w());
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
        CheckBox checkBox = gVar.f34721O;
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
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
    public String b(C6395a c6395a, int i8, Z0 z02) {
        C5688z0 c5688z0 = this.f33666O;
        return (c5688z0 == null || c5688z0.U() != s5.Q.RECIPE) ? V0().G(z02, this.f33666O, this.f33667P) : V0().E(z02, this.f33666O);
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void g(Object obj) {
        if (obj instanceof Z0) {
            AbstractC5662v2.l(this, (Z0) obj, "itemSelector");
        } else {
            AbstractC5544f3.r(this, obj);
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ boolean m(C6395a c6395a, int i8, String str) {
        return AbstractC5544f3.h(this, c6395a, i8, str);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        CharSequence u7;
        boolean z7;
        ArrayList<String> stringArrayList;
        super.onCreate(bundle);
        C6258h c8 = C6258h.c(getLayoutInflater());
        setContentView(c8.b());
        L0();
        this.f33667P = P1.C("en");
        final String stringExtra = getIntent().getStringExtra("com.headcode.ourgroceries.RecipeId");
        C5688z0 x7 = V0().x(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("com.headcode.ourgroceries.ListID");
        if (stringExtra2 == null) {
            C5688z0 O7 = V0().O();
            this.f33666O = O7;
            if (O7 != null) {
                stringExtra2 = O7.T();
            }
        } else {
            this.f33666O = V0().x(stringExtra2);
        }
        if (x7 == null || x7.size() == 0 || (stringExtra2 != null && this.f33666O == null)) {
            finish();
            return;
        }
        c8.f39665d.setLayoutManager(new LinearLayoutManager(this));
        C5536e3 c5536e3 = new C5536e3(this, this);
        c8.f39665d.setAdapter(c5536e3);
        c8.f39665d.j(new C5643s4(this, c5536e3.new f()));
        c8.f39664c.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33309o.B1(view);
            }
        });
        c8.f39666e.setOnClickListener(new View.OnClickListener() { // from class: com.headcode.ourgroceries.android.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33352o.C1(stringExtra, view);
            }
        });
        this.f33668Q.clear();
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("com.headcode.ourgroceries.android.ItemSelectorActivity.CheckedItemIds")) == null) {
            Iterator it = x7.iterator();
            while (it.hasNext()) {
                this.f33668Q.add(((Z0) it.next()).w());
            }
        } else {
            this.f33668Q.addAll(stringArrayList);
        }
        C6395a c6395a = new C6395a(x7.size());
        if (this.f33666O == null) {
            C5574j1 V02 = V0();
            s5.Q q8 = s5.Q.SHOPPING;
            Map n02 = V02.n0(q8);
            final C5688z0 c5688z0 = new C5688z0(q8, getString(M2.f33843C2));
            String T7 = c5688z0.T();
            n02.put(T7, c5688z0);
            HashMap hashMap = new HashMap();
            Iterator it2 = x7.iterator();
            z7 = true;
            while (it2.hasNext()) {
                Z0 z02 = (Z0) it2.next();
                String D7 = z02.D();
                if (D7.isEmpty()) {
                    D7 = T7;
                } else {
                    z7 = false;
                }
                A0 a02 = (A0) hashMap.get(D7);
                if (a02 == null) {
                    C5688z0 c5688z02 = (C5688z0) n02.get(D7);
                    if (c5688z02 == null) {
                        a02 = (A0) hashMap.get(c5688z0.T());
                        c5688z02 = c5688z0;
                    }
                    if (a02 == null) {
                        A0 a03 = new A0(c5688z02);
                        hashMap.put(c5688z02.T(), a03);
                        a02 = a03;
                    }
                }
                a02.c().add(z02);
            }
            ArrayList<A0> arrayList = new ArrayList(hashMap.values());
            Collections.sort(arrayList, new Comparator() { // from class: com.headcode.ourgroceries.android.E0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ItemSelectorActivity.D1(c5688z0, (A0) obj, (A0) obj2);
                }
            });
            if (arrayList.size() == 1 && ((A0) arrayList.get(0)).a() == c5688z0) {
                ((A0) arrayList.get(0)).f(false);
            }
            if (arrayList.size() != 1) {
                u7 = P1.u(this, M2.f33851D2, x7.W());
            } else {
                C5688z0 c5688z03 = (C5688z0) ((A0) arrayList.get(0)).a();
                u7 = c5688z03 == c5688z0 ? P1.u(this, M2.f33859E2, x7.W()) : P1.u(this, M2.f33867F2, x7.W(), c5688z03.W());
            }
            for (A0 a04 : arrayList) {
                C5688z0 c5688z04 = (C5688z0) a04.a();
                c6395a.l(p5.c.g(c5688z04.T(), a04.g() ? c5688z04.W() : null), false);
                List c9 = a04.c();
                Collections.sort(c9);
                c6395a.b(c9);
            }
        } else {
            ArrayList arrayList2 = new ArrayList(x7.size());
            Iterator it3 = x7.iterator();
            while (it3.hasNext()) {
                arrayList2.add((Z0) it3.next());
            }
            Collections.sort(arrayList2);
            c6395a.b(arrayList2);
            u7 = P1.u(this, M2.f33867F2, x7.W(), this.f33666O.W());
            z7 = false;
        }
        c5536e3.G0(c6395a, false);
        c8.f39668g.setText(u7);
        String string = getString(M2.f33827A2);
        if (z7) {
            string = string + " " + getString(M2.f33835B2);
        }
        c8.f39663b.setText(string);
    }

    @Override // com.headcode.ourgroceries.android.AbstractActivityC5575j2, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("com.headcode.ourgroceries.android.ItemSelectorActivity.CheckedItemIds", new ArrayList<>(this.f33668Q));
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public void r(Object obj, boolean z7) {
        Z0 z02 = (Z0) obj;
        if (z7) {
            this.f33668Q.add(z02.w());
        } else {
            this.f33668Q.remove(z02.w());
        }
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
}
