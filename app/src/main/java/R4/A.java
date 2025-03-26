package R4;

import S4.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f4763a = new A();

    /* renamed from: b, reason: collision with root package name */
    private static final A4.a f4764b;

    static {
        A4.a i8 = new C4.d().j(C0695c.f4823a).k(true).i();
        J6.r.d(i8, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f4764b = i8;
    }

    private A() {
    }

    private final EnumC0696d d(S4.b bVar) {
        return bVar == null ? EnumC0696d.COLLECTION_SDK_NOT_INSTALLED : bVar.b() ? EnumC0696d.COLLECTION_ENABLED : EnumC0696d.COLLECTION_DISABLED;
    }

    public final z a(com.google.firebase.f fVar, y yVar, T4.f fVar2, Map map, String str, String str2) {
        J6.r.e(fVar, "firebaseApp");
        J6.r.e(yVar, "sessionDetails");
        J6.r.e(fVar2, "sessionsSettings");
        J6.r.e(map, "subscribers");
        J6.r.e(str, "firebaseInstallationId");
        J6.r.e(str2, "firebaseAuthenticationToken");
        return new z(EnumC0701i.SESSION_START, new C(yVar.b(), yVar.a(), yVar.c(), yVar.d(), new C0697e(d((S4.b) map.get(b.a.PERFORMANCE)), d((S4.b) map.get(b.a.CRASHLYTICS)), fVar2.b()), str, str2), b(fVar));
    }

    public final C0694b b(com.google.firebase.f fVar) {
        J6.r.e(fVar, "firebaseApp");
        Context k8 = fVar.k();
        J6.r.d(k8, "firebaseApp.applicationContext");
        String packageName = k8.getPackageName();
        PackageInfo packageInfo = k8.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String c8 = fVar.n().c();
        J6.r.d(c8, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        J6.r.d(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        J6.r.d(str2, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        J6.r.d(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        J6.r.d(str5, "MANUFACTURER");
        v vVar = v.f4902a;
        Context k9 = fVar.k();
        J6.r.d(k9, "firebaseApp.applicationContext");
        u d8 = vVar.d(k9);
        Context k10 = fVar.k();
        J6.r.d(k10, "firebaseApp.applicationContext");
        return new C0694b(c8, str, "2.0.7", str2, tVar, new C0693a(packageName, str4, valueOf, str5, d8, vVar.c(k10)));
    }

    public final A4.a c() {
        return f4764b;
    }
}
