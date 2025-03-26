package com.headcode.ourgroceries.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.appcompat.app.AbstractActivityC0835d;
import com.headcode.ourgroceries.android.SignInActivity;
import e.AbstractC5734a;
import java.util.List;

/* renamed from: com.headcode.ourgroceries.android.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5625q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f34975a;

    /* renamed from: com.headcode.ourgroceries.android.q$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34976a;

        static {
            int[] iArr = new int[s5.Q.values().length];
            f34976a = iArr;
            try {
                iArr[s5.Q.SHOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34976a[s5.Q.RECIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.q$b */
    public enum b {
        VIEW,
        ADD_ITEM,
        SCAN_BARCODE,
        ADD_BY_VOICE;

        static b c(Intent intent) {
            String stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ListAction");
            return stringExtra == null ? intent.getBooleanExtra("com.headcode.ourgroceries.AddItem", false) ? ADD_ITEM : VIEW : valueOf(stringExtra);
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.q$c */
    public static class c extends AbstractC5734a {

        /* renamed from: a, reason: collision with root package name */
        private final int f34982a;

        public c(int i8) {
            this.f34982a = i8;
        }

        @Override // e.AbstractC5734a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Void r32) {
            Intent intent = new Intent(context, (Class<?>) SignInActivity.EmailAddressActivity.class);
            intent.putExtra("com.headcode.ourgroceries.android.SignInActivity.NOTICE_BUTTON_STRING_ID", this.f34982a);
            return intent;
        }

        @Override // e.AbstractC5734a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer c(int i8, Intent intent) {
            return Integer.valueOf(i8);
        }
    }

    static {
        f34975a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static Intent a(Context context) {
        return new Intent(context, (Class<?>) SettingsActivity.class);
    }

    public static Intent b(Context context, String str, s5.Q q8, b bVar) {
        Class cls;
        int i8 = a.f34976a[q8.ordinal()];
        if (i8 == 1) {
            cls = ShoppingListActivity.class;
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException("Attempt to launch unrecognized list type " + q8);
            }
            cls = RecipeActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.ListAction", bVar.name());
        if (str != null) {
            intent.setData(Uri.fromParts("ourgroceries", str, bVar.name()));
        }
        return intent;
    }

    public static Intent c(Context context, String str, b bVar) {
        Intent intent = new Intent(context, (Class<?>) ListsActivity.class);
        if (str != null) {
            intent.putExtra("com.headcode.ourgroceries.ListID", str);
            intent.putExtra("com.headcode.ourgroceries.ListAction", bVar.name());
        }
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(67108864);
        if (str != null) {
            intent.setData(Uri.fromParts("ourgroceries", str, bVar.name()));
        }
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) ListsActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268468224);
        return intent;
    }

    public static void e(C5688z0 c5688z0, AbstractActivityC0835d abstractActivityC0835d) {
        Intent d8 = d(abstractActivityC0835d);
        if (c5688z0 == null) {
            abstractActivityC0835d.startActivity(d8);
        } else {
            abstractActivityC0835d.startActivities(new Intent[]{d8, b(abstractActivityC0835d, c5688z0.T(), c5688z0.U(), b.VIEW)});
        }
    }

    static void f(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) ListNotesActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.EditMode", z7);
        context.startActivity(intent);
    }

    public static void g(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) AddItemActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.AddByVoice", true);
        activity.startActivityForResult(intent, 5);
    }

    public static void h(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) AddItemActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.Barcode", str2);
        activity.startActivityForResult(intent, 5);
    }

    public static void i(Activity activity, String str, String str2, String str3) {
        Intent intent = new Intent(activity, (Class<?>) AddItemActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.Value", str2);
        intent.putExtra("com.headcode.ourgroceries.Barcode", str3);
        activity.startActivityForResult(intent, 5);
    }

    public static void j(Activity activity, C5688z0 c5688z0, Z0 z02, String str) {
        Intent intent = new Intent(activity, (Class<?>) CategoriesActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", c5688z0.T());
        intent.putExtra("com.headcode.ourgroceries.ItemID", z02.w());
        intent.putExtra("com.headcode.ourgroceries.CategoryID", str);
        activity.startActivityForResult(intent, 4);
    }

    public static void k(Activity activity, Z0 z02) {
        Intent intent = new Intent(activity, (Class<?>) CategoryDetailsActivity.class);
        intent.putExtra("com.headcode.ourgroceries.CategoryID", z02.w());
        activity.startActivityForResult(intent, 0);
    }

    public static void l(Activity activity, C5688z0 c5688z0, Z0 z02, boolean z7) {
        Intent intent = new Intent(activity, (Class<?>) ItemDetailsActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", c5688z0.T());
        intent.putExtra("com.headcode.ourgroceries.ItemID", z02.w());
        intent.putExtra("com.headcode.ourgroceries.ScrollToPhoto", z7);
        activity.startActivityForResult(intent, 11);
    }

    static void m(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) ItemSelectorActivity.class);
        intent.putExtra("com.headcode.ourgroceries.RecipeId", str);
        intent.putExtra("com.headcode.ourgroceries.ListID", str2);
        activity.startActivityForResult(intent, 1);
    }

    public static void n(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) ListPickerActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ListID", str);
        intent.putExtra("com.headcode.ourgroceries.PseudoRow", str2);
        activity.startActivityForResult(intent, 3);
    }

    public static void o(Context context, String str, List list, int i8) {
        Intent intent = new Intent(context, (Class<?>) ListPickerActivity.class);
        intent.putExtra("com.headcode.ourgroceries.ImageUrl", str);
        intent.putExtra("com.headcode.ourgroceries.Items", (String[]) list.toArray(new String[0]));
        intent.putExtra("com.headcode.ourgroceries.AdAdaptedCounter", i8);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void p(Context context, C5688z0 c5688z0, b bVar) {
        if (c5688z0 != null) {
            r(context, c5688z0.T(), c5688z0.U(), bVar);
        }
    }

    public static void q(Context context, C5688z0 c5688z0, String str) {
        if (c5688z0 != null) {
            Intent b8 = b(context, c5688z0.T(), c5688z0.U(), b.VIEW);
            b8.putExtra("com.headcode.ourgroceries.ItemID", str);
            context.startActivity(b8);
        }
    }

    public static void r(Context context, String str, s5.Q q8, b bVar) {
        context.startActivity(b(context, str, q8, bVar));
    }

    static void s(Activity activity, String str, String str2, String str3) {
        Intent intent = new Intent(activity, (Class<?>) PhotoViewActivity.class);
        intent.putExtra("com.headcode.ourgroceries.Value", str);
        intent.putExtra("com.headcode.ourgroceries.Note", str2);
        intent.putExtra("com.headcode.ourgroceries.PhotoID", str3);
        activity.startActivity(intent);
    }

    public static void t(Context context) {
        context.startActivity(a(context));
    }

    public static void u(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SignInActivity.EmailAddressActivity.class));
    }

    public static void v(Activity activity, String str) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        if (str != null) {
            intent.putExtra("android.speech.extra.PROMPT", str);
        }
        activity.startActivityForResult(intent, 0);
    }

    public static void w(Context context) {
        context.startActivity(new Intent(context, (Class<?>) UpgradeActivity.class));
    }
}
