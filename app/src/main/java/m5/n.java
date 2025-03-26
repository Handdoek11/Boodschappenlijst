package m5;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.OurApplication;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q5.AbstractC6635a;
import s5.EnumC6743i;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f39203a;

    /* renamed from: b, reason: collision with root package name */
    protected final ViewGroup f39204b;

    /* renamed from: c, reason: collision with root package name */
    protected k f39205c;

    /* renamed from: d, reason: collision with root package name */
    protected final p f39206d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39207a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39208b;

        static {
            int[] iArr = new int[EnumC6743i.values().length];
            f39208b = iArr;
            try {
                iArr[EnumC6743i.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39208b[EnumC6743i.GAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39208b[EnumC6743i.AD_ADAPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39208b[EnumC6743i.FLIPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39208b[EnumC6743i.HOUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[p.values().length];
            f39207a = iArr2;
            try {
                iArr2[p.METALIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39207a[p.SHOPPING_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39207a[p.SHOPPING_LIST_ITEM_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39207a[p.RECIPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39207a[p.RECIPE_ITEM_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39207a[p.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    protected n(Context context, ViewGroup viewGroup, k kVar, p pVar) {
        this.f39203a = context;
        this.f39204b = viewGroup;
        n(kVar);
        this.f39206d = pVar;
    }

    public static n a(Activity activity, k kVar, p pVar) {
        n mVar;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(H2.f33606q);
        if (viewGroup == null) {
            return new z();
        }
        A2 a22 = A2.f33140n0;
        List emptyList = Collections.emptyList();
        int i8 = a.f39207a[pVar.ordinal()];
        if (i8 == 1) {
            emptyList = a22.u();
        } else if (i8 == 2) {
            emptyList = a22.E();
        } else if (i8 == 3) {
            emptyList = a22.F();
        } else if (i8 == 4) {
            emptyList = a22.B();
        } else if (i8 == 5) {
            emptyList = a22.C();
        }
        Iterator it = emptyList.iterator();
        n nVar = null;
        while (it.hasNext()) {
            int i9 = a.f39208b[((EnumC6743i) it.next()).ordinal()];
            if (i9 == 1) {
                mVar = new m(activity, kVar, viewGroup, pVar);
            } else if (i9 == 2) {
                mVar = new q(activity, kVar, viewGroup, pVar);
            } else if (i9 != 3) {
                if (i9 == 4) {
                    AbstractC6635a.a("OG-AdProvider", "The Flipp SDK has been removed");
                } else if (i9 == 5) {
                    mVar = new x(activity, kVar, viewGroup, pVar);
                }
            } else {
                boolean z7 = OurApplication.f34286H.i().O() != null;
                String K7 = a22.K();
                mVar = ((pVar != p.METALIST || z7) && (K7 == null || D.t(K7)) && D.g()) ? new C6221a(activity, kVar, viewGroup, pVar) : null;
            }
            nVar = y.s(kVar, nVar, mVar);
        }
        return y.s(kVar, nVar, new x(activity, kVar, viewGroup, pVar));
    }

    public abstract void b();

    public abstract boolean c();

    protected Resources d() {
        return (this.f39203a.getApplicationContext() != null ? this.f39203a.getApplicationContext() : this.f39203a).getResources();
    }

    protected void k() {
        this.f39204b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public final void n(k kVar) {
        if (kVar == null) {
            kVar = new l();
        }
        this.f39205c = kVar;
    }

    public void e() {
    }

    protected void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void l(String str) {
    }

    public void m(j jVar) {
    }
}
