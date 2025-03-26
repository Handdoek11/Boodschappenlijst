package P1;

import P1.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c2.C0978b;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4308a;

    /* renamed from: b, reason: collision with root package name */
    private final e f4309b;

    private static final class a implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4310a;

        a(Context context) {
            this.f4310a = context;
        }

        @Override // P1.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new f(this.f4310a, this);
        }

        @Override // P1.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // P1.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i8) {
            return resources.openRawResourceFd(i8);
        }
    }

    private static final class c implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4312a;

        c(Context context) {
            this.f4312a = context;
        }

        @Override // P1.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new f(this.f4312a, this);
        }

        @Override // P1.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // P1.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i8) {
            return resources.openRawResource(i8);
        }
    }

    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i8);
    }

    f(Context context, e eVar) {
        this.f4308a = context.getApplicationContext();
        this.f4309b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i8, int i9, J1.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(T1.l.f5175b);
        return new n.a(new C0978b(num), new d(theme, theme != null ? theme.getResources() : this.f4308a.getResources(), this.f4309b, num.intValue()));
    }

    @Override // P1.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: o, reason: collision with root package name */
        private final Resources.Theme f4313o;

        /* renamed from: s, reason: collision with root package name */
        private final Resources f4314s;

        /* renamed from: t, reason: collision with root package name */
        private final e f4315t;

        /* renamed from: u, reason: collision with root package name */
        private final int f4316u;

        /* renamed from: v, reason: collision with root package name */
        private Object f4317v;

        d(Resources.Theme theme, Resources resources, e eVar, int i8) {
            this.f4313o = theme;
            this.f4314s = resources;
            this.f4315t = eVar;
            this.f4316u = i8;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f4315t.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f4317v;
            if (obj != null) {
                try {
                    this.f4315t.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public J1.a d() {
            return J1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object c8 = this.f4315t.c(this.f4313o, this.f4314s, this.f4316u);
                this.f4317v = c8;
                aVar.f(c8);
            } catch (Resources.NotFoundException e8) {
                aVar.c(e8);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    private static final class b implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4311a;

        b(Context context) {
            this.f4311a = context;
        }

        @Override // P1.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new f(this.f4311a, this);
        }

        @Override // P1.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i8) {
            return T1.i.a(this.f4311a, i8, theme);
        }

        @Override // P1.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }
}
