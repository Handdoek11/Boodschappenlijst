package o5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.AbstractC5544f3;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.C5536e3;
import com.headcode.ourgroceries.android.C5536e3.f;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5643s4;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.G2;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.U;
import com.headcode.ourgroceries.android.Z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.C6264n;
import p5.C6395a;
import q5.AbstractC6635a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public class c0 extends DialogInterfaceOnCancelListenerC0906e implements C5536e3.d {

    public interface a {
        void I(String str, String str2, String str3, Z0 z02);

        void y();
    }

    public static DialogInterfaceOnCancelListenerC0906e A2(String str, String str2, String str3) {
        c0 c0Var = new c0();
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString("note", str2);
        bundle.putString("whence", str3);
        c0Var.R1(bundle);
        return c0Var;
    }

    private static String B2(String str, String str2) {
        return str.endsWith(str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static boolean u2(String str, Activity activity, C6395a c6395a) {
        String str2;
        OurApplication ourApplication = (OurApplication) activity.getApplication();
        C5688z0 D7 = ourApplication.i().D();
        if (D7 == null) {
            return false;
        }
        List<U.a> a8 = ourApplication.g().b(str, D7.g0()).a();
        if (a8.isEmpty()) {
            return false;
        }
        c6395a.l(p5.c.g("suggested_categories", a8.size() == 1 ? activity.getString(M2.f34101i4) : activity.getString(M2.f34093h4)), false);
        for (U.a aVar : a8) {
            String b8 = aVar.b();
            String a9 = aVar.a();
            if (a9 == null) {
                str2 = aVar.b() + "*";
            } else {
                Z0 J7 = D7.J(a9);
                if (J7 != null) {
                    b8 = J7.E();
                }
                str2 = a9 + "%";
            }
            c6395a.a(new Z0(b8, str2));
        }
        return true;
    }

    private static C6395a v2(String str, Activity activity) {
        C6395a c6395a = new C6395a(30);
        C5688z0 D7 = ((OurApplication) activity.getApplication()).i().D();
        if (D7 == null) {
            return c6395a;
        }
        u2(str, activity, c6395a);
        ArrayList arrayList = new ArrayList(10);
        D7.v(arrayList);
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, Z0.f34618C);
            c6395a.l(p5.c.g("your_categories", arrayList.size() == 1 ? activity.getString(M2.f34133m4) : activity.getString(M2.f34125l4)), false);
            c6395a.b(arrayList);
        }
        return c6395a;
    }

    public static String w2(Z0 z02, Activity activity) {
        if (z02.w().endsWith("*")) {
            return activity.getString(M2.f34117k4);
        }
        return null;
    }

    public static String x2(String str) {
        return B2(B2(str, "%"), "*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y2(DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("catSelCancel");
        a aVar = (a) p();
        if (aVar != null) {
            aVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z2(String str, String str2, String str3, DialogInterface dialogInterface, int i8) {
        AbstractC5673x.a("catSelLeave");
        a aVar = (a) p();
        if (aVar != null) {
            aVar.I(str, str2, str3, null);
        }
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public int A(C6395a c6395a, int i8, Z0 z02) {
        return 5;
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

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void G0(Context context) {
        super.G0(context);
        AbstractActivityC0911j J12 = J1();
        if (J12 instanceof a) {
            return;
        }
        throw new ClassCastException(J12 + " must implement SelectCategoryDialog.Listener");
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
        if (!(obj instanceof Z0)) {
            AbstractC6635a.b("OG-SelectCategoryDialog", "Unknown item tapped: " + obj.getClass());
            return;
        }
        a aVar = (a) p();
        if (aVar == null) {
            return;
        }
        Z0 z02 = (Z0) obj;
        C5574j1 i8 = ((OurApplication) p().getApplication()).i();
        C5688z0 D7 = i8.D();
        if (D7 == null) {
            return;
        }
        String w7 = z02.w();
        boolean z7 = false;
        if (w7.endsWith("%")) {
            w7 = w7.substring(0, w7.length() - 1);
            z7 = true;
        }
        Z0 J7 = D7.J(w7);
        if (J7 == null) {
            J7 = i8.j(z02.E());
            AbstractC5673x.a("catSelNew");
        } else if (z7) {
            AbstractC5673x.a("catSelSugg");
        } else {
            AbstractC5673x.a("catSelExist");
        }
        Bundle K12 = K1();
        aVar.I(K12.getString("name"), K12.getString("note"), K12.getString("whence"), J7);
        g2();
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
        return w2(z02, p());
    }

    @Override // com.headcode.ourgroceries.android.C5536e3.d
    public /* synthetic */ void g(Object obj) {
        AbstractC5544f3.r(this, obj);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public Dialog k2(Bundle bundle) {
        AbstractC5673x.a("catSelDialog");
        final String string = K1().getString("name");
        final String string2 = K1().getString("note");
        final String string3 = K1().getString("whence");
        String k8 = AbstractC6803e.k(string);
        AbstractActivityC0911j J12 = J1();
        C6395a v22 = v2(k8, J12);
        C6264n c8 = C6264n.c(J12.getLayoutInflater());
        LinearLayout b8 = c8.b();
        RecyclerView recyclerView = c8.f39705b;
        recyclerView.setLayoutManager(new LinearLayoutManager(J12));
        C5536e3 c5536e3 = new C5536e3(J12, this);
        recyclerView.setAdapter(c5536e3);
        recyclerView.j(new C5643s4(J12, c5536e3.new f()));
        c5536e3.G0(v22, false);
        AlertDialog create = new AlertDialog.Builder(J12).setTitle(J12.getString(M2.f34109j4, k8)).setIcon(G2.f33459g).setView(b8).setNeutralButton(M2.f33906K1, new DialogInterface.OnClickListener() { // from class: o5.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39925o.y2(dialogInterface, i8);
            }
        }).setNegativeButton(M2.f34033a0, new DialogInterface.OnClickListener() { // from class: o5.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f39931o.z2(string, string2, string3, dialogInterface, i8);
            }
        }).create();
        create.setCanceledOnTouchOutside(false);
        return create;
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
