package e1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5736a {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f35289e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final File f35290a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f35291b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35292c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f35293d;

    public C5736a(String str, File file, boolean z7) {
        File file2 = new File(file, str + ".lck");
        this.f35290a = file2;
        this.f35291b = a(file2.getAbsolutePath());
        this.f35292c = z7;
    }

    private static Lock a(String str) {
        Lock lock;
        Map map = f35289e;
        synchronized (map) {
            try {
                lock = (Lock) map.get(str);
                if (lock == null) {
                    lock = new ReentrantLock();
                    map.put(str, lock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lock;
    }

    public void b() {
        this.f35291b.lock();
        if (this.f35292c) {
            try {
                FileChannel channel = new FileOutputStream(this.f35290a).getChannel();
                this.f35293d = channel;
                channel.lock();
            } catch (IOException e8) {
                throw new IllegalStateException("Unable to grab copy lock.", e8);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f35293d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f35291b.unlock();
    }
}
