package T1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import d2.AbstractC5709k;
import java.util.List;

/* loaded from: classes.dex */
public class l implements J1.j {

    /* renamed from: b, reason: collision with root package name */
    public static final J1.g f5175b = J1.g.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f5176a;

    public l(Context context) {
        this.f5176a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f5176a.getPackageName())) {
            return this.f5176a;
        }
        try {
            return this.f5176a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            if (str.contains(this.f5176a.getPackageName())) {
                return this.f5176a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e8);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e8) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e8);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(Uri uri, int i8, int i9, J1.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d8 = d(uri, authority);
            int g8 = g(d8, uri);
            Resources.Theme theme = ((String) AbstractC5709k.d(authority)).equals(this.f5176a.getPackageName()) ? (Resources.Theme) hVar.c(f5175b) : null;
            return k.f(theme == null ? i.b(this.f5176a, d8, g8) : i.a(this.f5176a, g8, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // J1.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, J1.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
