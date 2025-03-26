package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f7999a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f8000b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z7) {
            activityOptions.setShareIdentityEnabled(z7);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f7999a = intent;
        this.f8000b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f7999a.setData(uri);
        AbstractC6278a.n(context, this.f7999a, this.f8000b);
    }

    /* renamed from: androidx.browser.customtabs.d$d, reason: collision with other inner class name */
    public static final class C0141d {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f8003c;

        /* renamed from: d, reason: collision with root package name */
        private ActivityOptions f8004d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f8005e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f8006f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f8007g;

        /* renamed from: j, reason: collision with root package name */
        private boolean f8010j;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f8001a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0138a f8002b = new a.C0138a();

        /* renamed from: h, reason: collision with root package name */
        private int f8008h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f8009i = true;

        public C0141d() {
        }

        private void b() {
            String a8 = b.a();
            if (TextUtils.isEmpty(a8)) {
                return;
            }
            Bundle bundleExtra = this.f8001a.hasExtra("com.android.browser.headers") ? this.f8001a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a8);
            this.f8001a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f8001a.putExtras(bundle);
        }

        private void e() {
            if (this.f8004d == null) {
                this.f8004d = a.a();
            }
            c.a(this.f8004d, this.f8010j);
        }

        public d a() {
            if (!this.f8001a.hasExtra("android.support.customtabs.extra.SESSION")) {
                d(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f8003c;
            if (arrayList != null) {
                this.f8001a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f8005e;
            if (arrayList2 != null) {
                this.f8001a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f8001a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8009i);
            this.f8001a.putExtras(this.f8002b.a().a());
            Bundle bundle = this.f8007g;
            if (bundle != null) {
                this.f8001a.putExtras(bundle);
            }
            if (this.f8006f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f8006f);
                this.f8001a.putExtras(bundle2);
            }
            this.f8001a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f8008h);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                b();
            }
            if (i8 >= 34) {
                e();
            }
            ActivityOptions activityOptions = this.f8004d;
            return new d(this.f8001a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0141d c(f fVar) {
            this.f8001a.setPackage(fVar.e().getPackageName());
            d(fVar.d(), fVar.f());
            return this;
        }

        public C0141d(f fVar) {
            if (fVar != null) {
                c(fVar);
            }
        }
    }
}
