package com.google.firebase.messaging;

import A3.AbstractC0379m;
import N4.a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import e4.InterfaceC5746a;
import h2.AbstractC5830d;
import h2.AbstractC5833g;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5836j;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class H {
    static void A(String str, Bundle bundle) {
        try {
            com.google.firebase.f.l();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d8 = d(bundle);
            if (d8 != null) {
                bundle2.putString("_nmid", d8);
            }
            String e8 = e(bundle);
            if (e8 != null) {
                bundle2.putString("_nmn", e8);
            }
            String i8 = i(bundle);
            if (!TextUtils.isEmpty(i8)) {
                bundle2.putString("label", i8);
            }
            String g8 = g(bundle);
            if (!TextUtils.isEmpty(g8)) {
                bundle2.putString("message_channel", g8);
            }
            String r8 = r(bundle);
            if (r8 != null) {
                bundle2.putString("_nt", r8);
            }
            String l8 = l(bundle);
            if (l8 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(l8));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String t7 = t(bundle);
            if (t7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(t7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String n8 = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", n8);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC5746a interfaceC5746a = (InterfaceC5746a) com.google.firebase.f.l().j(InterfaceC5746a.class);
            if (interfaceC5746a != null) {
                interfaceC5746a.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC5746a interfaceC5746a = (InterfaceC5746a) com.google.firebase.f.l().j(InterfaceC5746a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC5746a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC5746a.c("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC5746a.b("fcm", "_cmp", bundle2);
    }

    public static boolean C(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return E(intent.getExtras());
    }

    public static boolean E(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.f.l();
            Context k8 = com.google.firebase.f.l().k();
            SharedPreferences sharedPreferences = k8.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = k8.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(k8.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static N4.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0074a j8 = N4.a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(a.d.ANDROID).h(m(extras)).j(k(extras));
        String h8 = h(extras);
        if (h8 != null) {
            j8.g(h8);
        }
        String r8 = r(extras);
        if (r8 != null) {
            j8.m(r8);
        }
        String c8 = c(extras);
        if (c8 != null) {
            j8.c(c8);
        }
        String i8 = i(extras);
        if (i8 != null) {
            j8.b(i8);
        }
        String e8 = e(extras);
        if (e8 != null) {
            j8.d(e8);
        }
        long q8 = q(extras);
        if (q8 > 0) {
            j8.k(q8);
        }
        return j8.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) AbstractC0379m.a(com.google.firebase.installations.c.r(com.google.firebase.f.l()).d());
        } catch (InterruptedException | ExecutionException e8) {
            throw new RuntimeException(e8);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    static int k(Bundle bundle) {
        int p8 = p(bundle);
        if (p8 == 2) {
            return 5;
        }
        return p8 == 1 ? 10 : 0;
    }

    static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c m(Bundle bundle) {
        return (bundle == null || !J.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    static String n(Bundle bundle) {
        return (bundle == null || !J.t(bundle)) ? "data" : "display";
    }

    static String o() {
        return com.google.firebase.f.l().k().getPackageName();
    }

    static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing project number", e8);
            }
        }
        com.google.firebase.f l8 = com.google.firebase.f.l();
        String d8 = l8.n().d();
        if (d8 != null) {
            try {
                return Long.parseLong(d8);
            } catch (NumberFormatException e9) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e9);
            }
        }
        String c8 = l8.n().c();
        if (c8.startsWith("1:")) {
            String[] split = c8.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing app ID", e10);
            }
        } else {
            try {
                return Long.parseLong(c8);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing app ID", e11);
            }
        }
        return 0L;
    }

    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        B(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (D(intent)) {
            A("_nr", intent.getExtras());
        }
        if (C(intent)) {
            z(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.s());
        }
    }

    private static void z(a.b bVar, Intent intent, InterfaceC5836j interfaceC5836j) {
        if (interfaceC5836j == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        N4.a b8 = b(bVar, intent);
        if (b8 == null) {
            return;
        }
        try {
            interfaceC5836j.a("FCM_CLIENT_EVENT_LOGGING", N4.b.class, C5829c.b("proto"), new InterfaceC5834h() { // from class: com.google.firebase.messaging.G
                @Override // h2.InterfaceC5834h
                public final Object apply(Object obj) {
                    return ((N4.b) obj).c();
                }
            }).a(AbstractC5830d.g(N4.b.b().b(b8).a(), AbstractC5833g.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e8) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
        }
    }
}
