package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.InterfaceC0949a;
import b.InterfaceC0950b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0950b f7960a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f7961b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7962c;

    class a extends InterfaceC0949a.AbstractBinderC0201a {

        /* renamed from: o, reason: collision with root package name */
        private Handler f7963o = new Handler(Looper.getMainLooper());

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f7964s;

        /* renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        class RunnableC0139a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Bundle f7966o;

            RunnableC0139a(Bundle bundle) {
                this.f7966o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.j(this.f7966o);
            }
        }

        class b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f7968o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Bundle f7969s;

            b(int i8, Bundle bundle) {
                this.f7968o = i8;
                this.f7969s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.g(this.f7968o, this.f7969s);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        class RunnableC0140c implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ String f7971o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Bundle f7972s;

            RunnableC0140c(String str, Bundle bundle) {
                this.f7971o = str;
                this.f7972s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.a(this.f7971o, this.f7972s);
            }
        }

        class d implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Bundle f7974o;

            d(Bundle bundle) {
                this.f7974o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.e(this.f7974o);
            }
        }

        class e implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ String f7976o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Bundle f7977s;

            e(String str, Bundle bundle) {
                this.f7976o = str;
                this.f7977s = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.h(this.f7976o, this.f7977s);
            }
        }

        class f implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f7979o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Uri f7980s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f7981t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ Bundle f7982u;

            f(int i8, Uri uri, boolean z7, Bundle bundle) {
                this.f7979o = i8;
                this.f7980s = uri;
                this.f7981t = z7;
                this.f7982u = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.i(this.f7979o, this.f7980s, this.f7981t, this.f7982u);
            }
        }

        class g implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f7984o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f7985s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Bundle f7986t;

            g(int i8, int i9, Bundle bundle) {
                this.f7984o = i8;
                this.f7985s = i9;
                this.f7986t = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.d(this.f7984o, this.f7985s, this.f7986t);
            }
        }

        class h implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Bundle f7988o;

            h(Bundle bundle) {
                this.f7988o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.k(this.f7988o);
            }
        }

        class i implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f7990o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f7991s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f7992t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ int f7993u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ int f7994v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ Bundle f7995w;

            i(int i8, int i9, int i10, int i11, int i12, Bundle bundle) {
                this.f7990o = i8;
                this.f7991s = i9;
                this.f7992t = i10;
                this.f7993u = i11;
                this.f7994v = i12;
                this.f7995w = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.c(this.f7990o, this.f7991s, this.f7992t, this.f7993u, this.f7994v, this.f7995w);
            }
        }

        class j implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Bundle f7997o;

            j(Bundle bundle) {
                this.f7997o = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f7964s.f(this.f7997o);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f7964s = bVar;
        }

        @Override // b.InterfaceC0949a
        public void A1(int i8, int i9, int i10, int i11, int i12, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new i(i8, i9, i10, i11, i12, bundle));
        }

        @Override // b.InterfaceC0949a
        public void C6(Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new d(bundle));
        }

        @Override // b.InterfaceC0949a
        public Bundle E2(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f7964s;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // b.InterfaceC0949a
        public void J3(Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new j(bundle));
        }

        @Override // b.InterfaceC0949a
        public void J6(int i8, Uri uri, boolean z7, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new f(i8, uri, z7, bundle));
        }

        @Override // b.InterfaceC0949a
        public void W3(Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new RunnableC0139a(bundle));
        }

        @Override // b.InterfaceC0949a
        public void X4(String str, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new RunnableC0140c(str, bundle));
        }

        @Override // b.InterfaceC0949a
        public void o4(int i8, int i9, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new g(i8, i9, bundle));
        }

        @Override // b.InterfaceC0949a
        public void o5(Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new h(bundle));
        }

        @Override // b.InterfaceC0949a
        public void t6(String str, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new e(str, bundle));
        }

        @Override // b.InterfaceC0949a
        public void x5(int i8, Bundle bundle) {
            if (this.f7964s == null) {
                return;
            }
            this.f7963o.post(new b(i8, bundle));
        }
    }

    c(InterfaceC0950b interfaceC0950b, ComponentName componentName, Context context) {
        this.f7960a = interfaceC0950b;
        this.f7961b = componentName;
        this.f7962c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private InterfaceC0949a.AbstractBinderC0201a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z7) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z7 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean R32;
        InterfaceC0949a.AbstractBinderC0201a b8 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                R32 = this.f7960a.j5(b8, bundle);
            } else {
                R32 = this.f7960a.R3(b8);
            }
            if (R32) {
                return new f(this.f7960a, b8, this.f7961b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j8) {
        try {
            return this.f7960a.z3(j8);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
