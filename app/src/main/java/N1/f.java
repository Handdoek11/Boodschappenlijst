package N1;

import N1.d;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4070b;

        a(Context context, String str) {
            this.f4069a = context;
            this.f4070b = str;
        }

        @Override // N1.d.a
        public File a() {
            File cacheDir = this.f4069a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f4070b != null ? new File(cacheDir, this.f4070b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j8) {
        super(new a(context, str), j8);
    }
}
