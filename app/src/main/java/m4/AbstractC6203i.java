package m4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.adadapted.android.sdk.constants.EventStrings;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: m4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6203i {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f39058a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 m4.i$a, still in use, count: 1, list:
  (r0v0 m4.i$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 m4.i$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: m4.i$a */
    static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: B, reason: collision with root package name */
        private static final Map f39060B;

        static {
            HashMap hashMap = new HashMap(4);
            f39060B = hashMap;
            hashMap.put("armeabi-v7a", new a());
            hashMap.put("armeabi", new a());
            hashMap.put("arm64-v8a", new a());
            hashMap.put("x86", new a());
        }

        private a() {
        }

        static a c() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                j4.g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f39060B.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39061C.clone();
        }
    }

    public static String A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j8;
        synchronized (AbstractC6203i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j8 = memoryInfo.totalMem;
        }
        return j8;
    }

    public static long c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e8) {
                j4.g.f().e(str, e8);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return z(sb2);
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z7) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int p8 = p(context, str, "bool");
            if (p8 > 0) {
                return resources.getBoolean(p8);
            }
            int p9 = p(context, str, "string");
            if (p9 > 0) {
                return Boolean.parseBoolean(context.getString(p9));
            }
        }
        return z7;
    }

    public static List j(Context context) {
        ArrayList arrayList = new ArrayList();
        int p8 = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int p9 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int p10 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (p8 == 0 || p9 == 0 || p10 == 0) {
            j4.g.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(p8), Integer.valueOf(p9), Integer.valueOf(p10)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(p8);
        String[] stringArray2 = context.getResources().getStringArray(p9);
        String[] stringArray3 = context.getResources().getStringArray(p10);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            j4.g.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i8 = 0; i8 < stringArray3.length; i8++) {
            arrayList.add(new C6200f(stringArray[i8], stringArray2[i8], stringArray3[i8]));
        }
        return arrayList;
    }

    public static int k() {
        return a.c().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean w7 = w();
        ?? r02 = w7;
        if (x()) {
            r02 = (w7 ? 1 : 0) | 2;
        }
        return v() ? r02 | 4 : r02;
    }

    public static String m(Context context) {
        int p8 = p(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (p8 == 0) {
            p8 = p(context, "com.crashlytics.android.build_id", "string");
        }
        if (p8 != 0) {
            return context.getResources().getString(p8);
        }
        return null;
    }

    public static boolean n(Context context) {
        return (w() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String o(Context context) {
        int i8 = context.getApplicationContext().getApplicationInfo().icon;
        if (i8 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i8);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String r(String str, String str2) {
        return s(str.getBytes(), str2);
    }

    private static String s(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return t(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            j4.g.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e8);
            return "";
        }
    }

    public static String t(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            int i9 = i8 * 2;
            char[] cArr2 = f39058a;
            cArr[i9] = cArr2[(b8 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public static boolean u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean w() {
        if (!Build.PRODUCT.contains(EventStrings.SDK_EVENT_TYPE)) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean x() {
        boolean w7 = w();
        String str = Build.TAGS;
        if ((w7 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !w7 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean y(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String z(String str) {
        return r(str, "SHA-1");
    }
}
