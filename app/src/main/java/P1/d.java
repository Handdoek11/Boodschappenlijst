package P1;

import P1.n;
import android.util.Log;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import d2.AbstractC5699a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d implements n {

    public static class b implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new d();
        }
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i8, int i9, J1.h hVar) {
        return new n.a(new C0978b(file), new a(file));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }

    private static final class a implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final File f4301o;

        a(File file) {
            this.f4301o = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                aVar.f(AbstractC5699a.a(this.f4301o));
            } catch (IOException e8) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e8);
                }
                aVar.c(e8);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
