package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.adadapted.android.sdk.core.atl.AdditContent;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.internal.measurement.n7;
import f3.InterfaceC5781e;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class d6 extends AbstractC5462z3 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f30911i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f30912j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f30913c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f30914d;

    /* renamed from: e, reason: collision with root package name */
    private int f30915e;

    /* renamed from: f, reason: collision with root package name */
    private X0.a f30916f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f30917g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f30918h;

    d6(S2 s22) {
        super(s22);
        this.f30918h = null;
        this.f30914d = new AtomicLong(0L);
    }

    public static Bundle B(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        if (parcelableArr[i8] instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelableArr[i8]);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean B0(String str) {
        return E0((String) G.f30435e0.a(null), str);
    }

    public static Bundle E(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y5 y52 = (Y5) it.next();
            String str = y52.f30793v;
            if (str != null) {
                bundle.putString(y52.f30790s, str);
            } else {
                Long l8 = y52.f30792u;
                if (l8 != null) {
                    bundle.putLong(y52.f30790s, l8.longValue());
                } else {
                    Double d8 = y52.f30795x;
                    if (d8 != null) {
                        bundle.putDouble(y52.f30790s, d8.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean E0(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    static boolean F0(String str) {
        return E0((String) G.f30373B0.a(null), str);
    }

    private final Object G(int i8, Object obj, boolean z7, boolean z8, String str) {
        Bundle C7;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return H(String.valueOf(obj), i8, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (C7 = C((Bundle) parcelable, null)) != null && !C7.isEmpty()) {
                arrayList.add(C7);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static String H(String str, int i8, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i8) {
            return str;
        }
        if (!z7) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i8)) + "...";
    }

    static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean I0(String str) {
        Z2.r.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void J(Bundle bundle, int i8, String str, Object obj) {
        if (t0(bundle, i8)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                Z2.r.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean K0(String str) {
        for (String str2 : f30912j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int L0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !h0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int M0(String str) {
        if (!A0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !h0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int N0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean Q0(String str) {
        Z2.r.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void V(C5449x4 c5449x4, Bundle bundle, boolean z7) {
        if (bundle == null || c5449x4 == null || (bundle.containsKey("_sc") && !z7)) {
            if (bundle != null && c5449x4 == null && z7) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c5449x4.f31260a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c5449x4.f31261b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c5449x4.f31262c);
    }

    public static void W(c6 c6Var, int i8, String str, String str2, int i9) {
        X(c6Var, null, i8, str, str2, i9);
    }

    static void X(c6 c6Var, String str, int i8, String str2, String str3, int i9) {
        Bundle bundle = new Bundle();
        t0(bundle, i8);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", i9);
        }
        c6Var.a(str, "_err", bundle);
    }

    private final boolean X0() {
        Integer num;
        if (this.f30917g == null) {
            X0.a R02 = R0();
            boolean z7 = false;
            if (R02 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) R02.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z7 = true;
                        }
                    } catch (InterruptedException e8) {
                        e = e8;
                        num2 = num;
                        h().J().b("Measurement manager api exception", e);
                        this.f30917g = Boolean.FALSE;
                        num = num2;
                        h().I().b("Measurement manager api status result", num);
                        return this.f30917g.booleanValue();
                    } catch (CancellationException e9) {
                        e = e9;
                        num2 = num;
                        h().J().b("Measurement manager api exception", e);
                        this.f30917g = Boolean.FALSE;
                        num = num2;
                        h().I().b("Measurement manager api status result", num);
                        return this.f30917g.booleanValue();
                    } catch (ExecutionException e10) {
                        e = e10;
                        num2 = num;
                        h().J().b("Measurement manager api exception", e);
                        this.f30917g = Boolean.FALSE;
                        num = num2;
                        h().I().b("Measurement manager api status result", num);
                        return this.f30917g.booleanValue();
                    } catch (TimeoutException e11) {
                        e = e11;
                        num2 = num;
                        h().J().b("Measurement manager api exception", e);
                        this.f30917g = Boolean.FALSE;
                        num = num2;
                        h().I().b("Measurement manager api status result", num);
                        return this.f30917g.booleanValue();
                    }
                }
                this.f30917g = Boolean.valueOf(z7);
            } catch (InterruptedException e12) {
                e = e12;
            } catch (CancellationException e13) {
                e = e13;
            } catch (ExecutionException e14) {
                e = e14;
            } catch (TimeoutException e15) {
                e = e15;
            }
            h().I().b("Measurement manager api status result", num);
        }
        return this.f30917g.booleanValue();
    }

    private final void Y(String str, String str2, String str3, Bundle bundle, List list, boolean z7) {
        int M02;
        int i8;
        String str4;
        int v7;
        int i9;
        if (bundle == null) {
            return;
        }
        int i10 = a().g().a0(231100000, true) ? 35 : 0;
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                M02 = !z7 ? M0(str5) : 0;
                if (M02 == 0) {
                    M02 = L0(str5);
                }
            } else {
                M02 = 0;
            }
            if (M02 != 0) {
                J(bundle, M02, str5, M02 == 3 ? str5 : null);
                bundle.remove(str5);
                i8 = i10;
            } else {
                if (f0(bundle.get(str5))) {
                    h().K().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    v7 = 22;
                    str4 = str5;
                    i8 = i10;
                } else {
                    str4 = str5;
                    i8 = i10;
                    v7 = v(str, str2, str5, bundle.get(str5), bundle, list, z7, false);
                }
                if (v7 == 0 || "_ev".equals(str4)) {
                    if (!I0(str4) || l0(str4, w3.s.f44354d)) {
                        i9 = i8;
                    } else {
                        int i12 = i11 + 1;
                        if (a0(231100000, true)) {
                            i9 = i8;
                            if (i12 > i9) {
                                h().F().c("Item can't contain more than " + i9 + " item-scoped custom params", e().c(str2), e().a(bundle));
                                t0(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            h().F().c("Item array not supported on client's version of Google Play Services (Android Only)", e().c(str2), e().a(bundle));
                            t0(bundle, 23);
                            bundle.remove(str4);
                            i9 = i8;
                        }
                        i11 = i12;
                    }
                    i10 = i9;
                } else {
                    J(bundle, v7, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
            i10 = i8;
        }
    }

    static boolean b0(Context context) {
        ActivityInfo receiverInfo;
        Z2.r.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean c0(Context context, boolean z7) {
        Z2.r.l(context);
        return Build.VERSION.SDK_INT >= 24 ? z0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : z0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean d0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean e0(Bundle bundle, int i8) {
        int i9 = 0;
        if (bundle.size() <= i8) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i9++;
            if (i9 > i8) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean f0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean k0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Z2.r.l(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean l0(String str, String[] strArr) {
        Z2.r.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList r0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5312e c5312e = (C5312e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c5312e.f30921o);
            bundle.putString("origin", c5312e.f30922s);
            bundle.putLong("creation_timestamp", c5312e.f30924u);
            bundle.putString("name", c5312e.f30923t.f30790s);
            w3.o.b(bundle, Z2.r.l(c5312e.f30923t.A0()));
            bundle.putBoolean("active", c5312e.f30925v);
            String str = c5312e.f30926w;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            E e8 = c5312e.f30927x;
            if (e8 != null) {
                bundle.putString("timed_out_event_name", e8.f30332o);
                D d8 = e8.f30333s;
                if (d8 != null) {
                    bundle.putBundle("timed_out_event_params", d8.D0());
                }
            }
            bundle.putLong("trigger_timeout", c5312e.f30928y);
            E e9 = c5312e.f30929z;
            if (e9 != null) {
                bundle.putString("triggered_event_name", e9.f30332o);
                D d9 = e9.f30333s;
                if (d9 != null) {
                    bundle.putBundle("triggered_event_params", d9.D0());
                }
            }
            bundle.putLong("triggered_timestamp", c5312e.f30923t.f30791t);
            bundle.putLong("time_to_live", c5312e.f30919A);
            E e10 = c5312e.f30920B;
            if (e10 != null) {
                bundle.putString("expired_event_name", e10.f30332o);
                D d10 = e10.f30333s;
                if (d10 != null) {
                    bundle.putBundle("expired_event_params", d10.D0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean s0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f8 = h3.e.a(context).f(str, 64);
            if (f8 == null || (signatureArr = f8.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            h().E().b("Package name not found", e8);
            return true;
        } catch (CertificateException e9) {
            h().E().b("Error obtaining certificate", e9);
            return true;
        }
    }

    private static boolean t0(Bundle bundle, int i8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i8);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int v(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d6.v(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] v0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long w(long j8, long j9) {
        return (j8 + (j9 * 60000)) / 86400000;
    }

    static int w0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long y(D d8) {
        long j8 = 0;
        if (d8 == null) {
            return 0L;
        }
        Iterator it = d8.iterator();
        while (it.hasNext()) {
            if (d8.F0((String) it.next()) instanceof Parcelable[]) {
                j8 += ((Parcelable[]) r3).length;
            }
        }
        return j8;
    }

    static long z(byte[] bArr) {
        Z2.r.l(bArr);
        int i8 = 0;
        Z2.r.p(bArr.length > 0);
        long j8 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j8 += (bArr[length] & 255) << i8;
            i8 += 8;
        }
        return j8;
    }

    private static boolean z0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    final Bundle A(Uri uri, boolean z7) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z7 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z7 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z7 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z7 && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            h().J().b("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    final boolean A0(String str, String str2) {
        if (str2 == null) {
            h().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            h().F().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            h().F().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                h().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final Bundle C(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object q02 = q0(str2, bundle.get(str2));
                if (q02 == null) {
                    h().K().b("Param value can't be null", e().f(str2));
                } else {
                    M(bundle2, str2, q02);
                }
            }
        }
        return bundle2;
    }

    final boolean C0(String str, String str2) {
        if (n7.a() && a().r(G.f30486z0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().P().equals(str);
    }

    final Bundle D(String str, String str2, Bundle bundle, List list, boolean z7) {
        int M02;
        int i8;
        d6 d6Var = this;
        boolean l02 = l0(str2, w3.q.f44348d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int w7 = a().w();
        int i9 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                M02 = !z7 ? d6Var.M0(str3) : 0;
                if (M02 == 0) {
                    M02 = d6Var.L0(str3);
                }
            } else {
                M02 = 0;
            }
            if (M02 != 0) {
                J(bundle2, M02, str3, M02 == 3 ? str3 : null);
                bundle2.remove(str3);
                i8 = w7;
            } else {
                i8 = w7;
                int v7 = v(str, str2, str3, bundle.get(str3), bundle2, list, z7, l02);
                if (v7 == 17) {
                    J(bundle2, v7, str3, Boolean.FALSE);
                } else if (v7 != 0 && !"_ev".equals(str3)) {
                    J(bundle2, v7, v7 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (I0(str3)) {
                    int i10 = i9 + 1;
                    if (i10 > i8) {
                        h().F().c("Event can't contain more than " + i8 + " params", e().c(str2), e().a(bundle));
                        t0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i9 = i10;
                }
            }
            w7 = i8;
            d6Var = this;
        }
        return bundle2;
    }

    final boolean D0(String str) {
        l();
        if (h3.e.a(zza()).a(str) == 0) {
            return true;
        }
        h().D().b("Permission not granted", str);
        return false;
    }

    final E F(String str, String str2, Bundle bundle, String str3, long j8, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (t(str2) != 0) {
            h().E().b("Invalid conditional property event name", e().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle D7 = D(str, str2, bundle2, f3.f.a("_o"), true);
        if (z7) {
            D7 = C(D7, str);
        }
        Z2.r.l(D7);
        return new E(str2, new D(D7), str3, j8);
    }

    public final int G0() {
        if (this.f30918h == null) {
            this.f30918h = Integer.valueOf(C1109h.f().a(zza()) / 1000);
        }
        return this.f30918h.intValue();
    }

    public final URL I(long j8, String str, String str2, long j9, String str3) {
        try {
            Z2.r.f(str2);
            Z2.r.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j8), Integer.valueOf(G0())), str2, str, Long.valueOf(j9));
            if (str.equals(a().Q())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e8) {
            e = e8;
            h().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            h().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean J0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    final void K(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            h().J().b("Params already contained engagement", Long.valueOf(j9));
        }
        bundle.putLong("_et", j8 + j9);
    }

    final void L(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                g().M(bundle, str, bundle2.get(str));
            }
        }
    }

    final void M(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            h().K().c("Not putting event parameter. Invalid value type. name, type", e().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void N(com.google.android.gms.internal.measurement.T0 t02, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i8);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning int value to wrapper", e8);
        }
    }

    public final void O(com.google.android.gms.internal.measurement.T0 t02, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning long value to wrapper", e8);
        }
    }

    final long O0() {
        l();
        if (!B0(this.f31239a.z().D())) {
            return 0L;
        }
        long j8 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : w0() < ((Integer) G.f30418Y.a(null)).intValue() ? 16L : 0L;
        if (!D0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j8 |= 2;
        }
        if (j8 == 0 && !X0()) {
            j8 |= 64;
        }
        if (j8 == 0) {
            return 1L;
        }
        return j8;
    }

    public final void P(com.google.android.gms.internal.measurement.T0 t02, Bundle bundle) {
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning bundle value to wrapper", e8);
        }
    }

    public final long P0() {
        long andIncrement;
        long j8;
        if (this.f30914d.get() != 0) {
            synchronized (this.f30914d) {
                this.f30914d.compareAndSet(-1L, 1L);
                andIncrement = this.f30914d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f30914d) {
            long nextLong = new Random(System.nanoTime() ^ zzb().a()).nextLong();
            int i8 = this.f30915e + 1;
            this.f30915e = i8;
            j8 = nextLong + i8;
        }
        return j8;
    }

    public final void Q(com.google.android.gms.internal.measurement.T0 t02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning string value to wrapper", e8);
        }
    }

    public final void R(com.google.android.gms.internal.measurement.T0 t02, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning bundle list to wrapper", e8);
        }
    }

    final X0.a R0() {
        if (this.f30916f == null) {
            this.f30916f = X0.a.a(zza());
        }
        return this.f30916f;
    }

    public final void S(com.google.android.gms.internal.measurement.T0 t02, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning boolean value to wrapper", e8);
        }
    }

    final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(com.google.android.gms.internal.measurement.T0 t02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            t02.R(bundle);
        } catch (RemoteException e8) {
            this.f31239a.h().J().b("Error returning byte array to wrapper", e8);
        }
    }

    final void U(C5405r2 c5405r2, int i8) {
        int i9 = 0;
        for (String str : new TreeSet(c5405r2.f31170d.keySet())) {
            if (I0(str) && (i9 = i9 + 1) > i8) {
                h().F().c("Event can't contain more than " + i8 + " params", e().c(c5405r2.f31167a), e().a(c5405r2.f31170d));
                t0(c5405r2.f31170d, 5);
                c5405r2.f31170d.remove(str);
            }
        }
    }

    final SecureRandom U0() {
        l();
        if (this.f30913c == null) {
            this.f30913c = new SecureRandom();
        }
        return this.f30913c;
    }

    final boolean V0() {
        l();
        return O0() == 1;
    }

    public final boolean W0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final void Z(Parcelable[] parcelableArr, int i8) {
        Z2.r.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i9 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (I0(str) && !l0(str, w3.s.f44354d) && (i9 = i9 + 1) > i8) {
                    h().F().c("Param can't contain more than " + i8 + " item-scoped custom parameters", e().f(str), e().a(bundle));
                    t0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    public final boolean a0(int i8, boolean z7) {
        Boolean U7 = this.f31239a.H().U();
        if (G0() < i8 / 1000) {
            return (U7 == null || U7.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    final boolean g0(String str, double d8) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString(AdditContent.AdditSources.DEEPLINK, str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d8));
            return edit.commit();
        } catch (RuntimeException e8) {
            h().E().b("Failed to persist Deferred Deep Link. exception", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    final boolean h0(String str, int i8, String str2) {
        if (str2 == null) {
            h().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i8) {
            return true;
        }
        h().F().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    final boolean i0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (Q0(str)) {
                return true;
            }
            if (this.f31239a.p()) {
                h().F().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C5378n2.t(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f31239a.p()) {
                h().F().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (Q0(str2)) {
            return true;
        }
        h().F().b("Invalid admob_app_id. Analytics disabled.", C5378n2.t(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    final boolean j0(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i8) {
                h().K().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final void m() {
        l();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                h().J().a("Utils falling back to Random for random id");
            }
        }
        this.f30914d.set(nextLong);
    }

    final boolean m0(String str, String[] strArr, String str2) {
        return n0(str, strArr, null, str2);
    }

    final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            h().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        Z2.r.l(str2);
        for (String str3 : f30911i) {
            if (str2.startsWith(str3)) {
                h().F().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !l0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && l0(str2, strArr2)) {
            return true;
        }
        h().F().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int p0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (m0("user property", w3.r.f44349a, str)) {
            return !h0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object q0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return G(a().v(null, false), obj, true, true, null);
        }
        return G(H0(str) ? a().v(null, false) : a().p(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5462z3
    protected final boolean r() {
        return true;
    }

    public final int s(int i8) {
        return C1109h.f().h(zza(), 12451000);
    }

    final int t(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (n0("event", w3.q.f44345a, w3.q.f44346b, str)) {
            return !h0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int u(String str, Object obj) {
        return "_ldl".equals(str) ? j0("user property referrer", str, N0(str), obj) : j0("user property", str, N0(str), obj) ? 0 : 7;
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            h().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            h().F().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            h().F().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                h().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long x(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.l()
            Z2.r.l(r7)
            Z2.r.f(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = T0()
            r2 = -1
            if (r1 != 0) goto L23
            com.google.android.gms.measurement.internal.n2 r7 = r6.h()
            com.google.android.gms.measurement.internal.p2 r7 = r7.E()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L74
        L23:
            r4 = 0
            if (r0 == 0) goto L73
            boolean r8 = r6.s0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 != 0) goto L73
            h3.d r7 = h3.e.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.Context r8 = r6.zza()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.f(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r7 == 0) goto L58
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 <= 0) goto L58
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            long r2 = z(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L56:
            r7 = move-exception
            goto L66
        L58:
            com.google.android.gms.measurement.internal.n2 r7 = r6.h()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            com.google.android.gms.measurement.internal.p2 r7 = r7.J()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L66:
            com.google.android.gms.measurement.internal.n2 r8 = r6.h()
            com.google.android.gms.measurement.internal.p2 r8 = r8.E()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L73:
            r2 = r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d6.x(android.content.Context, java.lang.String):long");
    }

    final long x0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i8 = 0;
        try {
            ApplicationInfo c8 = h3.e.a(zza()).c(str, 0);
            if (c8 != null) {
                i8 = c8.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            h().H().b("PackageManager failed to find running app: app_id", str);
        }
        return i8;
    }

    final Object y0(String str, Object obj) {
        return "_ldl".equals(str) ? G(N0(str), obj, true, false, null) : G(N0(str), obj, false, false, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
