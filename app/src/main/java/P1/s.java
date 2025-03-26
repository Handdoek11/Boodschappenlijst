package P1;

import P1.n;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* loaded from: classes.dex */
public class s implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f4376a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f4377b;

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f4378a;

        public a(Resources resources) {
            this.f4378a = resources;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new s(this.f4378a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f4379a;

        public b(Resources resources) {
            this.f4379a = resources;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new s(this.f4379a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f4380a;

        public c(Resources resources) {
            this.f4380a = resources;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new s(this.f4380a, w.c());
        }
    }

    public s(Resources resources, n nVar) {
        this.f4377b = resources;
        this.f4376a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f4377b.getResourcePackageName(num.intValue()) + '/' + this.f4377b.getResourceTypeName(num.intValue()) + '/' + this.f4377b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e8) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e8);
            return null;
        }
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i8, int i9, J1.h hVar) {
        Uri d8 = d(num);
        if (d8 == null) {
            return null;
        }
        return this.f4376a.a(d8, i8, i9, hVar);
    }

    @Override // P1.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
