package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.C1057e;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5103e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f29892a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return n(intent.getExtras(), "ProxyBillingActivity");
        }
        j("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        j(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, long j8) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j8);
        return bundle;
    }

    public static Bundle d(boolean z7, boolean z8, boolean z9, boolean z10, String str, long j8) {
        Bundle bundle = new Bundle();
        c(bundle, str, j8);
        if (z7 && z9) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z8 && z10) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static C1057e e(Intent intent, String str) {
        if (intent != null) {
            C1057e.a c8 = C1057e.c();
            c8.c(b(intent.getExtras(), str));
            c8.b(f(intent.getExtras(), str));
            return c8.a();
        }
        j("BillingHelper", "Got null intent!");
        C1057e.a c9 = C1057e.c();
        c9.c(6);
        c9.b("An internal error occurred.");
        return c9.a();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        j(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String g(int i8) {
        return EnumC5185s0.a(i8).toString();
    }

    public static List h(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase o8 = o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (o8 == null) {
                i("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(o8);
        } else {
            i("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i8 = 0; i8 < stringArrayList.size() && i8 < stringArrayList2.size(); i8++) {
                Purchase o9 = o(stringArrayList.get(i8), stringArrayList2.get(i8));
                if (o9 != null) {
                    arrayList.add(o9);
                }
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i8 = 40000;
            while (!str2.isEmpty() && i8 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i8));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i8 -= min;
            }
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle l(C1057e c1057e, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1057e.b());
        bundle.putString("DEBUG_MESSAGE", c1057e.a());
        bundle.putInt("LOG_REASON", i8 - 1);
        return bundle;
    }

    public static Bundle m(C1057e c1057e, int i8, String str) {
        Bundle l8 = l(c1057e, 5);
        if (str != null) {
            l8.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return l8;
    }

    private static int n(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        j(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase o(String str, String str2) {
        if (str == null || str2 == null) {
            i("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e8) {
            j("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e8.toString()));
            return null;
        }
    }
}
