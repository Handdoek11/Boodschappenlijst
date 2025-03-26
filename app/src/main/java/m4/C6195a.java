package m4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6195a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39021b;

    /* renamed from: c, reason: collision with root package name */
    public final List f39022c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39023d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39024e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39025f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39026g;

    /* renamed from: h, reason: collision with root package name */
    public final j4.f f39027h;

    public C6195a(String str, String str2, List list, String str3, String str4, String str5, String str6, j4.f fVar) {
        this.f39020a = str;
        this.f39021b = str2;
        this.f39022c = list;
        this.f39023d = str3;
        this.f39024e = str4;
        this.f39025f = str5;
        this.f39026g = str6;
        this.f39027h = fVar;
    }

    public static C6195a a(Context context, J j8, String str, String str2, List list, j4.f fVar) {
        String packageName = context.getPackageName();
        String g8 = j8.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b8 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C6195a(str, str2, list, g8, packageName, b8, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
