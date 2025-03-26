package K1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* renamed from: o, reason: collision with root package name */
    private final Uri f3609o;

    /* renamed from: s, reason: collision with root package name */
    private final e f3610s;

    /* renamed from: t, reason: collision with root package name */
    private InputStream f3611t;

    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f3612b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f3613a;

        a(ContentResolver contentResolver) {
            this.f3613a = contentResolver;
        }

        @Override // K1.d
        public Cursor a(Uri uri) {
            return this.f3613a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3612b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f3614b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f3615a;

        b(ContentResolver contentResolver) {
            this.f3615a = contentResolver;
        }

        @Override // K1.d
        public Cursor a(Uri uri) {
            return this.f3615a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3614b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f3609o = uri;
        this.f3610s = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() {
        InputStream d8 = this.f3610s.d(this.f3609o);
        int a8 = d8 != null ? this.f3610s.a(this.f3609o) : -1;
        return a8 != -1 ? new g(d8, a8) : d8;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f3611t;
        if (inputStream != null) {
            try {
                inputStream.close();
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
            InputStream h8 = h();
            this.f3611t = h8;
            aVar.f(h8);
        } catch (FileNotFoundException e8) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e8);
            }
            aVar.c(e8);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
