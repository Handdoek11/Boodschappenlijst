package s7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* loaded from: classes2.dex */
public class f implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    boolean f43741a = false;

    /* renamed from: b, reason: collision with root package name */
    final Map f43742b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final LinkedBlockingQueue f43743c = new LinkedBlockingQueue();

    @Override // org.slf4j.ILoggerFactory
    public synchronized q7.a a(String str) {
        e eVar;
        eVar = (e) this.f43742b.get(str);
        if (eVar == null) {
            eVar = new e(str, this.f43743c, this.f43741a);
            this.f43742b.put(str, eVar);
        }
        return eVar;
    }

    public void b() {
        this.f43742b.clear();
        this.f43743c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f43743c;
    }

    public List d() {
        return new ArrayList(this.f43742b.values());
    }

    public void e() {
        this.f43741a = true;
    }
}
