package m5;

import android.content.Context;
import android.content.Intent;
import com.adadapted.android.sdk.AdAdapted;
import com.adadapted.android.sdk.AdAdaptedListManager;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.atl.AddToListItem;
import com.adadapted.android.sdk.core.interfaces.AaSdkAdditContentListener;
import com.adadapted.android.sdk.core.interfaces.AaSdkEventListener;
import com.adadapted.android.sdk.core.interfaces.AaSdkSessionListener;
import com.adadapted.android.sdk.core.view.AaZoneView;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.AbstractC5648t2;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.C5574j1;
import com.headcode.ourgroceries.android.C5587k6;
import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.InterfaceC5533e0;
import com.headcode.ourgroceries.android.L4;
import com.headcode.ourgroceries.android.M2;
import com.headcode.ourgroceries.android.OurApplication;
import com.headcode.ourgroceries.android.V1;
import com.headcode.ourgroceries.android.Z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import q5.AbstractC6635a;
import s5.G;
import s5.Q;
import t5.AbstractC6803e;
import t5.AbstractC6804f;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC5533e0 f39150a = InterfaceC5533e0.a.f34686a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f39151b = false;

    /* renamed from: c, reason: collision with root package name */
    private static AddToListContent f39152c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f39153d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final AaSdkAdditContentListener f39154e = new AaSdkAdditContentListener() { // from class: m5.A
        @Override // com.adadapted.android.sdk.core.interfaces.AaSdkAdditContentListener
        public final void onContentAvailable(AddToListContent addToListContent) {
            D.p(addToListContent);
        }
    };

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39155a;

        static {
            int[] iArr = new int[p.values().length];
            f39155a = iArr;
            try {
                iArr[p.METALIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39155a[p.SHOPPING_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39155a[p.RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39155a[p.SHOPPING_LIST_ITEM_DETAILS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39155a[p.RECIPE_ITEM_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39155a[p.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static String d(AddToListContent addToListContent) {
        Iterator<AddToListItem> it = addToListContent.getItems().iterator();
        while (it.hasNext()) {
            String productImage = it.next().getProductImage();
            if (!AbstractC6803e.o(productImage)) {
                return productImage;
            }
        }
        return null;
    }

    public static List e(AddToListContent addToListContent) {
        List<AddToListItem> items = addToListContent.getItems();
        ArrayList arrayList = new ArrayList(items.size());
        Iterator<AddToListItem> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTitle());
        }
        return arrayList;
    }

    private static String f(p pVar) {
        switch (a.f39155a[pVar.ordinal()]) {
            case 1:
                return "100912";
            case 2:
            case 3:
                return "100910";
            case 4:
            case 5:
                return "100760";
            case 6:
                throw new IllegalArgumentException("unknown app zone " + pVar);
            default:
                return null;
        }
    }

    public static boolean g() {
        return f39151b;
    }

    public static void h(Context context) {
        AdAdapted.INSTANCE.withAppId("NTDMZJK2NTM2YWZH").inEnv(AdAdapted.Env.PROD).enableKeywordIntercept(true).enablePayloads(true).setSdkEventListener(new AaSdkEventListener() { // from class: m5.B
            @Override // com.adadapted.android.sdk.core.interfaces.AaSdkEventListener
            public final void onNextAdEvent(String str, String str2) {
                D.n(str, str2);
            }
        }).setSdkSessionListener(new AaSdkSessionListener() { // from class: m5.C
            @Override // com.adadapted.android.sdk.core.interfaces.AaSdkSessionListener
            public final void onHasAdsToServe(boolean z7, List list) {
                D.o(z7, list);
            }
        }).setSdkAdditContentListener(f39154e).start(context);
    }

    public static void i(AaZoneView aaZoneView, p pVar) {
        aaZoneView.init(f(pVar));
        aaZoneView.enableAdaptiveSizing(true);
    }

    public static void j(C5587k6 c5587k6, C5688z0 c5688z0, String str) {
        if (q(c5587k6, c5688z0)) {
            AdAdaptedListManager.INSTANCE.itemAddedToList(c5688z0.W(), AbstractC6803e.k(str));
        }
    }

    public static void k(C5587k6 c5587k6, C5688z0 c5688z0, String str) {
        if (q(c5587k6, c5688z0)) {
            AdAdaptedListManager.INSTANCE.itemCrossedOffList(c5688z0.W(), AbstractC6803e.k(str));
        }
    }

    public static void l(C5587k6 c5587k6, C5688z0 c5688z0, String str) {
        if (q(c5587k6, c5688z0)) {
            AdAdaptedListManager.INSTANCE.itemDeletedFromList(c5688z0.W(), AbstractC6803e.k(str));
        }
    }

    public static void m(C5587k6 c5587k6, C5688z0 c5688z0, List list) {
        if (q(c5587k6, c5688z0)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdAdaptedListManager.INSTANCE.itemDeletedFromList(c5688z0.W(), AbstractC6803e.k(((Z0) it.next()).E()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(boolean z7, List list) {
        AbstractC6635a.d("OG-AdAdapted", "AdAdapted has ads to serve: " + z7 + ", " + list);
        f39151b = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(AddToListContent addToListContent) {
        AbstractC5673x.a("adAdaptedPayloadNotification");
        f39150a.b("AddIt initiated " + addToListContent.getSource());
        OurApplication ourApplication = OurApplication.f34286H;
        if (ourApplication.o().U().f()) {
            AbstractC5673x.a("adAdaptedPayloadUpgraded");
            addToListContent.failed("user is upgraded");
            f39150a.b("AddIt upgraded");
            return;
        }
        if (AddToListContent.Sources.OUT_OF_APP.equals(addToListContent.getSource()) && !A2.f33140n0.U(G.FEATURE_AA_OUT_OF_APP_ADS)) {
            AbstractC5673x.a("adAdaptedPayloadSuppressed");
            addToListContent.failed("feature is disabled");
            f39150a.b("AddIt disabled");
            return;
        }
        f39152c = addToListContent;
        f39153d++;
        List e8 = e(addToListContent);
        f39150a.b("AddIt counter " + f39153d + " titles " + e8);
        if (e8.isEmpty()) {
            AbstractC5673x.a("adAdaptedPayloadEmpty");
            addToListContent.failed("zero items");
        } else {
            AbstractC5673x.a("addToListAsk");
            AbstractC5625q.o(ourApplication, d(addToListContent), e8, f39153d);
        }
    }

    private static boolean q(C5587k6 c5587k6, C5688z0 c5688z0) {
        return !c5587k6.U().f() && A2.f33140n0.y() && A2.f33140n0.U(G.FEATURE_AA_LIST_MANAGER) && c5688z0.U() == Q.SHOPPING;
    }

    public static void r(int i8, String str) {
        String str2;
        L4 n8 = OurApplication.f34286H.n();
        C5574j1 i9 = OurApplication.f34286H.i();
        C5688z0 x7 = i9.x(str);
        if (str != null) {
            String W7 = x7 == null ? "(null)" : x7.W();
            f39150a.b("AddIt selected list ID \"" + str + "\" named \"" + W7 + "\"");
        }
        if (f39152c == null) {
            AbstractC6635a.b("OG-AdAdapted", "setAddToListResult with mAddToListContent == null");
            return;
        }
        if (i8 != f39153d) {
            AbstractC6635a.b("OG-AdAdapted", "setAddToListResult expected counter " + f39153d + "; was passed counter " + i8);
            return;
        }
        if (x7 == null) {
            AbstractC5673x.a("adAdaptedPayloadRejected");
            if (str == null) {
                str2 = "user declined";
            } else {
                AbstractC6635a.b("OG-AdAdapted", "Can't find list with ID " + str);
                str2 = "list not found";
            }
            Iterator<AddToListItem> it = f39152c.getItems().iterator();
            while (it.hasNext()) {
                f39152c.itemFailed(it.next(), str2);
            }
        } else {
            OurApplication ourApplication = OurApplication.f34286H;
            AbstractC5673x.a("adAdaptedPayloadAdded");
            ArrayList arrayList = new ArrayList();
            String str3 = null;
            for (AddToListItem addToListItem : f39152c.getItems()) {
                String title = addToListItem.getTitle();
                arrayList.add(title);
                f39150a.b("AddIt adding item \"" + title + "\"");
                Z0 n9 = i9.n(x7, title, ourApplication.getString(M2.f34216x));
                String productImage = addToListItem.getProductImage();
                if (!AbstractC6803e.o(productImage)) {
                    String a8 = AbstractC6804f.a();
                    n8.U0(a8, productImage);
                    n9 = i9.K0(x7, n9, a8);
                    AbstractC5648t2.a(a8, productImage);
                }
                f39152c.itemAcknowledge(addToListItem);
                j(ourApplication.o(), x7, title);
                if (str3 == null) {
                    str3 = n9.w();
                }
            }
            AbstractC5673x.a("addToListAskChosen");
            V1.b(ourApplication.getString(M2.f34224y, AbstractC6803e.r(arrayList, Locale.getDefault())), true);
            OurApplication ourApplication2 = OurApplication.f34286H;
            Intent d8 = AbstractC5625q.d(ourApplication2);
            d8.addFlags(268435456);
            d8.addFlags(32768);
            Intent b8 = AbstractC5625q.b(ourApplication2, x7.T(), x7.U(), AbstractC5625q.b.VIEW);
            if (str3 != null) {
                b8.putExtra("com.headcode.ourgroceries.ItemID", str3);
            }
            ourApplication2.startActivities(new Intent[]{d8, b8});
        }
        f39152c = null;
    }

    public static void s(InterfaceC5533e0 interfaceC5533e0) {
        f39150a = interfaceC5533e0;
    }

    public static boolean t(String str) {
        return str.equals("US") || str.equals("CA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(String str, String str2) {
    }
}
