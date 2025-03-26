package P1;

import P1.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4381a;

    /* renamed from: b, reason: collision with root package name */
    private final n f4382b;

    private static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4383a;

        a(Context context) {
            this.f4383a = context;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new t(this.f4383a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4384a;

        b(Context context) {
            this.f4384a = context;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new t(this.f4384a, rVar.d(Integer.class, InputStream.class));
        }
    }

    t(Context context, n nVar) {
        this.f4381a = context.getApplicationContext();
        this.f4382b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i8, int i9, J1.h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f4382b.a(Integer.valueOf(parseInt), i8, i9, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e8) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e8);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i8, int i9, J1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f4381a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f4381a.getPackageName());
        if (identifier != 0) {
            return this.f4382b.a(Integer.valueOf(identifier), i8, i9, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, J1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i8, i9, hVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i8, i9, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f4381a.getPackageName().equals(uri.getAuthority());
    }
}
