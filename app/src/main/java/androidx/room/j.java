package androidx.room;

import android.content.Context;
import android.util.Log;
import e1.AbstractC5738c;
import e1.AbstractC5739d;
import e1.C5736a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
class j implements g1.c {

    /* renamed from: o, reason: collision with root package name */
    private final Context f11397o;

    /* renamed from: s, reason: collision with root package name */
    private final String f11398s;

    /* renamed from: t, reason: collision with root package name */
    private final File f11399t;

    /* renamed from: u, reason: collision with root package name */
    private final int f11400u;

    /* renamed from: v, reason: collision with root package name */
    private final g1.c f11401v;

    /* renamed from: w, reason: collision with root package name */
    private a f11402w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f11403x;

    j(Context context, String str, File file, int i8, g1.c cVar) {
        this.f11397o = context;
        this.f11398s = str;
        this.f11399t = file;
        this.f11400u = i8;
        this.f11401v = cVar;
    }

    private void d(File file) {
        ReadableByteChannel channel;
        if (this.f11398s != null) {
            channel = Channels.newChannel(this.f11397o.getAssets().open(this.f11398s));
        } else {
            if (this.f11399t == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f11399t).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f11397o.getCacheDir());
        createTempFile.deleteOnExit();
        AbstractC5739d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void f() {
        String databaseName = getDatabaseName();
        File databasePath = this.f11397o.getDatabasePath(databaseName);
        a aVar = this.f11402w;
        C5736a c5736a = new C5736a(databaseName, this.f11397o.getFilesDir(), aVar == null || aVar.f11302j);
        try {
            c5736a.b();
            if (!databasePath.exists()) {
                try {
                    d(databasePath);
                    c5736a.c();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            }
            if (this.f11402w == null) {
                c5736a.c();
                return;
            }
            try {
                int c8 = AbstractC5738c.c(databasePath);
                int i8 = this.f11400u;
                if (c8 == i8) {
                    c5736a.c();
                    return;
                }
                if (this.f11402w.a(c8, i8)) {
                    c5736a.c();
                    return;
                }
                if (this.f11397o.deleteDatabase(databaseName)) {
                    try {
                        d(databasePath);
                    } catch (IOException e9) {
                        Log.w("ROOM", "Unable to copy database file.", e9);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c5736a.c();
                return;
            } catch (IOException e10) {
                Log.w("ROOM", "Unable to read database version.", e10);
                c5736a.c();
                return;
            }
        } catch (Throwable th) {
            c5736a.c();
            throw th;
        }
        c5736a.c();
        throw th;
    }

    @Override // g1.c
    public synchronized g1.b U() {
        try {
            if (!this.f11403x) {
                f();
                this.f11403x = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11401v.U();
    }

    @Override // g1.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f11401v.close();
        this.f11403x = false;
    }

    void e(a aVar) {
        this.f11402w = aVar;
    }

    @Override // g1.c
    public String getDatabaseName() {
        return this.f11401v.getDatabaseName();
    }

    @Override // g1.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        this.f11401v.setWriteAheadLoggingEnabled(z7);
    }
}
