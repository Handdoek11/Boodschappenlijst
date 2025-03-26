package com.google.android.gms.dynamite;

import Z2.AbstractC0777p;
import Z2.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f13448h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f13449i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f13450j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f13451k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f13452l;

    /* renamed from: q, reason: collision with root package name */
    private static m f13457q;

    /* renamed from: r, reason: collision with root package name */
    private static n f13458r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13459a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f13453m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f13454n = new b();

    /* renamed from: o, reason: collision with root package name */
    private static final a.InterfaceC0229a f13455o = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final a f13442b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final a f13443c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final a f13444d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final a f13445e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final a f13446f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final a f13447g = new i();

    /* renamed from: p, reason: collision with root package name */
    public static final a f13456p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, j3.f fVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, j3.f fVar) {
            super(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        public interface InterfaceC0229a {
            int a(Context context, String str, boolean z7);

            int b(Context context, String str);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f13460a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f13461b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f13462c = 0;
        }

        b a(Context context, String str, InterfaceC0229a interfaceC0229a);
    }

    private DynamiteModule(Context context) {
        r.l(context);
        this.f13459a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC0777p.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:551), block:B:116:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.a r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0177 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00eb, blocks: (B:3:0x0002, B:64:0x00e0, B:66:0x00e6, B:73:0x010a, B:101:0x0169, B:105:0x0177, B:123:0x01c9, B:124:0x01cc, B:118:0x01c1, B:71:0x00ef, B:126:0x01ce, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00dd, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00bb, B:63:0x00df, B:61:0x00c1), top: B:136:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:142:0x0026, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bf -> B:132:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c1 -> B:132:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        j3.f fVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f13458r = nVar;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new LoadingException("Failed to instantiate dynamite loader", e, fVar);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new LoadingException("Failed to instantiate dynamite loader", e, fVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new LoadingException("Failed to instantiate dynamite loader", e, fVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, fVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f13453m.get();
        if (kVar == null || kVar.f13463a != null) {
            return false;
        }
        kVar.f13463a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f13452l)) {
            return true;
        }
        boolean z7 = false;
        if (f13452l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1109h.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z7 = true;
            }
            f13452l = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f13450j = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f13457q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f13457q = mVar;
                    return mVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.f13459a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f13459a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
