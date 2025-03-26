package P1;

import P1.n;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class v implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f4386a;

    public static final class a implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new v(rVar.d(Uri.class, InputStream.class));
        }
    }

    public v(n nVar) {
        this.f4386a = nVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(String str, int i8, int i9, J1.h hVar) {
        Uri e8 = e(str);
        if (e8 == null || !this.f4386a.b(e8)) {
            return null;
        }
        return this.f4386a.a(e8, i8, i9, hVar);
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
