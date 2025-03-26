package H2;

import D2.A;
import D2.c2;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC4275ug;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C6880f;
import w2.C6882h;
import x2.AbstractC6904c;
import x2.C6903b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f2925b = new HandlerC1968Yd0(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f2926c = w2.i.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f2927d = I2.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f2928e = C6903b.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f2929f = AbstractC6904c.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f2930g = R2.b.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private static final String f2931h = C6880f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f2932a = -1.0f;

    public static final void A(Context context, String str, String str2, Bundle bundle, boolean z7, f fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = C1109h.f().a(context) + ".244410000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        fVar.n(appendQueryParameter.toString());
    }

    public static final int B(Context context, int i8) {
        return t(context.getResources().getDisplayMetrics(), i8);
    }

    public static final String C(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || v()) {
            string = "emulator";
        }
        return D(string, "MD5");
    }

    private static String D(String str, String str2) {
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void b(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(n((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(l((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void c(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) A.c().a(AbstractC3184kf.f23964o)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, n((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), a((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
            return;
        }
        int i8 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i8 < length) {
                    numArr2[i8] = Integer.valueOf(iArr[i8]);
                    i8++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, l(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i8 < length2) {
                    dArr3[i8] = Double.valueOf(dArr2[i8]);
                    i8++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, l(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i8 < length3) {
                    lArr2[i8] = Long.valueOf(jArr[i8]);
                    i8++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, l(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i8 < length4) {
                boolArr2[i8] = Boolean.valueOf(zArr[i8]);
                i8++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, l(boolArr));
    }

    private static final void d(ViewGroup viewGroup, c2 c2Var, String str, int i8, int i9) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i8);
        textView.setBackgroundColor(i9);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i8);
        int B7 = B(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(c2Var.f1226w - B7, c2Var.f1223t - B7, 17));
        viewGroup.addView(frameLayout, c2Var.f1226w, c2Var.f1223t);
    }

    public static int e(Context context, int i8) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i9 = configuration.orientation;
        if (i8 == 0) {
            i8 = i9;
        }
        return i8 == i9 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static ActivityManager.MemoryInfo g(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
        } catch (NullPointerException unused) {
            p.g("Error retrieving the memory information.");
        }
        return memoryInfo;
    }

    public static C6882h h(Context context, int i8, int i9, int i10) {
        int e8 = e(context, i10);
        if (e8 == -1) {
            return C6882h.f44279q;
        }
        return new C6882h(i8, Math.max(Math.min(i8 > 655 ? Math.round((i8 / 728.0f) * 90.0f) : i8 > 632 ? 81 : i8 > 526 ? Math.round((i8 / 468.0f) * 60.0f) : i8 > 432 ? 68 : Math.round((i8 / 320.0f) * 50.0f), Math.min(90, Math.round(e8 * 0.15f))), 50));
    }

    public static String i() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String j(String str) {
        return D(str, "MD5");
    }

    public static String k(String str) {
        return D(str, "SHA-256");
    }

    public static boolean s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC4275ug.f27087d.e());
    }

    public static final int t(DisplayMetrics displayMetrics, int i8) {
        return (int) TypedValue.applyDimension(1, i8, displayMetrics);
    }

    public static final String u(StackTraceElement[] stackTraceElementArr, String str) {
        int i8;
        String str2;
        int i9 = 0;
        while (true) {
            i8 = i9 + 1;
            if (i8 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            String className = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f2926c.equalsIgnoreCase(className) || f2927d.equalsIgnoreCase(className) || f2928e.equalsIgnoreCase(className) || f2929f.equalsIgnoreCase(className) || f2930g.equalsIgnoreCase(className) || f2931h.equalsIgnoreCase(className))) {
                break;
            }
            i9 = i8;
        }
        str2 = stackTraceElementArr[i8].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i10 = 2; i10 > 0 && stringTokenizer.hasMoreElements(); i10--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean v() {
        boolean booleanValue = ((Boolean) A.c().a(AbstractC3184kf.nb)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean w(Context context, int i8) {
        return C1109h.f().h(context, i8) == 0;
    }

    public static final boolean x(Context context) {
        int h8 = C1109h.f().h(context, 12451000);
        return h8 == 0 || h8 == 2;
    }

    public static final boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int z(DisplayMetrics displayMetrics, int i8) {
        return Math.round(i8 / displayMetrics.density);
    }

    public final int f(Context context, int i8) {
        if (this.f2932a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f2932a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f2932a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i8 / this.f2932a);
    }

    final JSONArray l(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject m(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject n(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e8) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e8.getMessage())));
        }
    }

    public final JSONObject o(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m(bundle);
        } catch (JSONException e8) {
            p.e("Error converting Bundle to JSON", e8);
            return null;
        }
    }

    public final void p(ViewGroup viewGroup, c2 c2Var, String str, String str2) {
        if (str2 != null) {
            p.g(str2);
        }
        d(viewGroup, c2Var, str, -65536, -16777216);
    }

    public final void q(ViewGroup viewGroup, c2 c2Var, String str) {
        d(viewGroup, c2Var, "Ads by Google", -16777216, -1);
    }

    public final void r(Context context, String str, String str2, Bundle bundle, boolean z7) {
        A(context, str, "gmob-apps", bundle, true, new f() { // from class: H2.d
            @Override // H2.f
            public final t n(String str3) {
                new e(this.f2923a, str3).start();
                return t.SUCCESS;
            }
        });
    }
}
