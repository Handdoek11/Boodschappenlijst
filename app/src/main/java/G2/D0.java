package G2;

import D2.C0555y;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.common.AbstractC1110i;
import com.google.android.gms.internal.ads.AbstractC1232Df0;
import com.google.android.gms.internal.ads.AbstractC1389Ho;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC2207bf;
import com.google.android.gms.internal.ads.AbstractC2326ck0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3187kg0;
import com.google.android.gms.internal.ads.AbstractC4275ug;
import com.google.android.gms.internal.ads.AbstractC4312uy0;
import com.google.android.gms.internal.ads.C1517Lf;
import com.google.android.gms.internal.ads.C2835hM;
import com.google.android.gms.internal.ads.C2970ig0;
import com.google.android.gms.internal.ads.C3785q60;
import com.google.android.gms.internal.ads.C3868qu;
import com.google.android.gms.internal.ads.C4111t60;
import com.google.android.gms.internal.ads.GN;
import com.google.android.gms.internal.ads.HN;
import com.google.android.gms.internal.ads.HandlerC1968Yd0;
import com.google.android.gms.internal.ads.InterfaceC2128au;
import com.google.android.gms.internal.ads.InterfaceC3430mt;
import f3.AbstractC5780d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: l, reason: collision with root package name */
    public static final HandlerC1968Yd0 f2566l = new HandlerC0610q0(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private String f2573g;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f2574h;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f2567a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f2568b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f2569c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f2570d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private boolean f2571e = true;

    /* renamed from: f, reason: collision with root package name */
    private final Object f2572f = new Object();

    /* renamed from: i, reason: collision with root package name */
    private boolean f2575i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2576j = false;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f2577k = Executors.newSingleThreadExecutor();

    public static int A(int i8) {
        if (i8 >= 5000) {
            return i8;
        }
        if (i8 <= 0) {
            return 60000;
        }
        H2.p.g("HTTP timeout too low: " + i8 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static String B(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean C(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void D(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void E(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String F(final Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return W();
        }
        try {
            C0596j0 a8 = C0596j0.a();
            if (TextUtils.isEmpty(a8.f2634a)) {
                if (AbstractC5780d.c()) {
                    str3 = (String) AbstractC0590g0.a(context, new Callable() { // from class: G2.h0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                AbstractC0608p0.k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            AbstractC0608p0.k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            f3.p.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = AbstractC1110i.getRemoteContext(context);
                    str3 = (String) AbstractC0590g0.a(context, new Callable() { // from class: G2.i0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z7 = false;
                            if (context2 != null) {
                                AbstractC0608p0.k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                AbstractC0608p0.k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z7 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                AbstractC0608p0.k("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z7) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    AbstractC0608p0.k("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                a8.f2634a = str3;
            }
            str2 = a8.f2634a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = W();
        }
        String str4 = str2 + " (Mobile; " + str;
        try {
            if (h3.e.a(context).g()) {
                str4 = str4 + ";aia";
            }
        } catch (Exception e8) {
            C2.v.s().x(e8, "AdUtil.getUserAgent");
        }
        return str4.concat(")");
    }

    public static List I() {
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23838a;
        List b8 = D2.A.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b8.iterator();
        while (it.hasNext()) {
            Iterator it2 = C2970ig0.b(AbstractC1232Df0.c(',')).d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    AbstractC0608p0.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void M(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            AbstractC1497Kq.f16644a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean T(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.D0.T(android.view.View):boolean");
    }

    public static final void U(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String V(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return B(z(context));
    }

    static final String W() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String X() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final Integer Y(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics Z(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final T a(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                H2.p.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof T ? (T) queryLocalInterface : new Q(iBinder);
        } catch (Exception e8) {
            C2.v.s().x(e8, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    protected static final int[] a0() {
        return new int[]{0, 0};
    }

    public static final boolean b(Context context, String str) {
        Context a8 = AbstractC1389Ho.a(context);
        return h3.e.a(a8).b(str, a8.getPackageName()) == 0;
    }

    public static final Map b0(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        String optString = optJSONArray.optString(i8);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e8) {
            C2.v.s().x(e8, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final boolean c(Context context) {
        try {
            return f3.i.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long c0(View view) {
        float f8 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f8 = Math.min(f8, view2.getAlpha());
            view = view2.getParent();
        } while (f8 > 0.0f);
        return Math.round((f8 >= 0.0f ? f8 : 0.0f) * 100.0f);
    }

    public static final boolean d(String str) {
        if (!H2.m.k()) {
            return false;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23827Y4)).booleanValue()) {
            return false;
        }
        String str2 = (String) D2.A.c().a(AbstractC3184kf.f23844a5);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) D2.A.c().a(AbstractC3184kf.f23835Z4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final WebResourceResponse d0(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C2.v.t().H(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new P(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e8) {
            H2.p.h("Could not fetch MRAID JS.", e8);
        }
        return null;
    }

    public static final boolean e(Context context) {
        KeyguardManager y7;
        return (context == null || (y7 = y(context)) == null || !y7.isKeyguardLocked()) ? false : true;
    }

    public static final String e0() {
        Resources f8 = C2.v.s().f();
        return f8 != null ? f8.getString(A2.d.f168t) : "Test Ad";
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            H2.p.e("Error loading class.", th);
            C2.v.s().x(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean g() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        try {
            Bundle z7 = z(context);
            String string = z7.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(B(z7))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean j(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(View view, int i8, MotionEvent motionEvent) {
        String str;
        int i9;
        int i10;
        int i11;
        String str2;
        C3785q60 P7;
        C4111t60 z7;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof C2835hM) {
                view2 = ((C2835hM) view2).getChildAt(0);
            }
            if (view2 instanceof com.google.android.gms.ads.nativead.d) {
                str = "NATIVE";
                i9 = 1;
            } else {
                str = "UNKNOWN";
                i9 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i11 = rect.width();
                i10 = rect.height();
            } else {
                i10 = 0;
                i11 = 0;
            }
            C2.v.t();
            long c02 = c0(view2);
            view2.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof InterfaceC2128au) || (z7 = ((InterfaceC2128au) view2).z()) == null) {
                str2 = "none";
            } else {
                str2 = z7.f26832b;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof InterfaceC3430mt) && (P7 = ((InterfaceC3430mt) view2).P()) != null) {
                str = C3785q60.a(P7.f25780b);
                i9 = P7.f25786e;
                str3 = P7.f25756E;
            }
            H2.p.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i9), view2.getClass().getName(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i11), Integer.valueOf(i10), Long.valueOf(c02), Integer.toString(i8, 2)));
        } catch (Exception e8) {
            H2.p.e("Failure getting view location.", e8);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        C2.v.u();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(Context context, String str, String str2) {
        new Y(context, str, str2, null, null).b();
    }

    public static final void n(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) AbstractC4275ug.f27085b.e()).booleanValue()) {
                f3.g.a(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            H2.p.g("Could not parse value:".concat(e8.toString()));
            return 0;
        }
    }

    public static final Map p(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23973p)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i8 = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i8);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i8);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i8, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i8 = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? a0() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] r(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] a02 = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? a0() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{C0555y.b().f(activity, a02[0]), C0555y.b().f(activity, a02[1])};
    }

    public static final boolean s(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z7 = C2.v.t().f2571e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || T(view);
        long c02 = c0(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z7)) {
            if (!((Boolean) D2.A.c().a(AbstractC3184kf.f24019u1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) D2.A.c().a(AbstractC3184kf.wa)).booleanValue()) {
                    return true;
                }
                if (c02 >= ((Integer) D2.A.c().a(AbstractC3184kf.ya)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void t(Context context, Intent intent) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Ta)).booleanValue()) {
            E(context, intent);
            return;
        }
        try {
            E(context, intent);
        } catch (SecurityException e8) {
            H2.p.h("", e8);
            C2.v.s().x(e8, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void u(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            U(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            H2.p.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e8) {
            H2.p.e("No browser is found.", e8);
        }
    }

    public static final int[] v(Activity activity) {
        int[] q8 = q(activity);
        return new int[]{C0555y.b().f(activity, q8[0]), C0555y.b().f(activity, q8[1])};
    }

    public static final boolean w(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return s(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, y(context));
    }

    public static final void x(Context context, Intent intent, HN hn, String str) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Vc)).booleanValue() || !(context instanceof C3868qu)) {
            t(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) D2.A.c().a(AbstractC3184kf.Xc))) {
                    ((C3868qu) context).c(intent, 236);
                    if (!((Boolean) D2.A.c().a(AbstractC3184kf.Wc)).booleanValue() || hn == null) {
                        return;
                    }
                    GN a8 = hn.a();
                    a8.b("action", "hila");
                    a8.b("gqi", AbstractC3187kg0.c(str));
                    a8.f();
                    return;
                }
            }
            t(context, intent);
        } catch (ActivityNotFoundException e8) {
            e = e8;
            H2.p.e("Error occurred while starting activity for result", e);
            C2.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (SecurityException e9) {
            e = e9;
            H2.p.e("Error occurred while starting activity for result", e);
            C2.v.s().x(e, "AdUtil.startActivityForResult");
            t(context, intent);
        } catch (Exception e10) {
            H2.p.e("Error occurred while starting activity for result", e10);
            C2.v.s().x(e10, "AdUtil.startActivityForResult");
            t(context, intent);
        }
    }

    private static KeyguardManager y(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle z(Context context) {
        try {
            return h3.e.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
            AbstractC0608p0.l("Error getting metadata", e8);
            return null;
        }
    }

    public final com.google.common.util.concurrent.d G(final Uri uri) {
        return AbstractC2326ck0.j(new Callable() { // from class: G2.y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC1968Yd0 handlerC1968Yd0 = D0.f2566l;
                C2.v.t();
                return D0.p(uri);
            }
        }, this.f2577k);
    }

    public final String H(Context context, String str) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.fb)).booleanValue()) {
            if (this.f2574h != null) {
                return this.f2574h;
            }
            this.f2574h = F(context, str);
            return this.f2574h;
        }
        synchronized (this.f2572f) {
            try {
                String str2 = this.f2573g;
                if (str2 != null) {
                    return str2;
                }
                String F7 = F(context, str);
                this.f2573g = F7;
                return F7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(Context context, String str, boolean z7, HttpURLConnection httpURLConnection, boolean z8, int i8) {
        int A7 = A(i8);
        H2.p.f("HTTP timeout: " + A7 + " milliseconds.");
        httpURLConnection.setConnectTimeout(A7);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A7);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", H(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    final /* synthetic */ void L(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f2569c.set(AbstractC0585e.b(context, str));
    }

    public final void N(final Context context, final String str, String str2, Bundle bundle, boolean z7) {
        C2.v.t();
        bundle.putString("device", X());
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23838a;
        bundle.putString("eids", TextUtils.join(",", D2.A.a().a()));
        if (bundle.isEmpty()) {
            H2.p.b("Empty or null bundle.");
        } else {
            final String str3 = (String) D2.A.c().a(AbstractC3184kf.ua);
            if (!this.f2570d.getAndSet(true)) {
                this.f2569c.set(AbstractC0585e.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: G2.x0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f2725o.L(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f2569c.get());
        }
        C0555y.b();
        H2.g.A(context, str, "gmob-apps", bundle, true, new H2.f() { // from class: G2.w0
            @Override // H2.f
            public final H2.t n(String str4) {
                HandlerC1968Yd0 handlerC1968Yd0 = D0.f2566l;
                C2.v.t();
                D0.m(context, str, str4);
                return H2.t.SUCCESS;
            }
        });
    }

    public final boolean O(String str) {
        return C(str, this.f2567a, (String) D2.A.c().a(AbstractC3184kf.f23965o0));
    }

    public final boolean P(String str) {
        return C(str, this.f2568b, (String) D2.A.c().a(AbstractC3184kf.f23974p0));
    }

    public final boolean Q(Context context) {
        if (this.f2576j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC3184kf.a(context);
        C0 c02 = null;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new A0(this, c02), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new A0(this, c02), intentFilter, 4);
        }
        this.f2576j = true;
        return true;
    }

    public final boolean R(Context context) {
        if (this.f2575i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC3184kf.a(context);
        C0 c02 = null;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Sa)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new B0(this, c02), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new B0(this, c02), intentFilter, 4);
        }
        this.f2575i = true;
        return true;
    }

    public final int S(Context context, Uri uri) {
        if (context == null) {
            AbstractC0608p0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            D(context, uri);
            return 2;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23683G4)).booleanValue()) {
            androidx.browser.customtabs.d a8 = new d.C0141d(C2.v.i().c()).a();
            a8.f7999a.setPackage(AbstractC4312uy0.a(context));
            a8.a(context, uri);
            return 5;
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23667E4)).booleanValue()) {
            D(context, uri);
            return 9;
        }
        C1517Lf c1517Lf = new C1517Lf();
        c1517Lf.e(new z0(this, c1517Lf, context, uri));
        c1517Lf.b((Activity) context);
        return 5;
    }
}
