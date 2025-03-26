package q4;

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import p4.AbstractC6384F;
import p4.C6386a;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final A4.a f42370a = new C4.d().j(C6386a.f40429a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Object a(JsonReader jsonReader);
    }

    private static AbstractC6384F.e.d.f A(JsonReader jsonReader) {
        AbstractC6384F.e.d.f.a a8 = AbstractC6384F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("assignments")) {
                a8.b(n(jsonReader, new a() { // from class: q4.f
                    @Override // q4.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.a.b.AbstractC0310d B(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.AbstractC0310d.AbstractC0311a a8 = AbstractC6384F.e.d.a.b.AbstractC0310d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "address":
                    a8.b(jsonReader.nextLong());
                    break;
                case "code":
                    a8.c(jsonReader.nextString());
                    break;
                case "name":
                    a8.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d.a.b.AbstractC0312e C(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0313a a8 = AbstractC6384F.e.d.a.b.AbstractC0312e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a8.b(n(jsonReader, new i()));
                    break;
                case "name":
                    a8.d(jsonReader.nextString());
                    break;
                case "importance":
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.d.b D(JsonReader jsonReader) {
        AbstractC6384F.d.b.a a8 = AbstractC6384F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a8.c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                a8.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.d E(JsonReader jsonReader) {
        AbstractC6384F.d.a a8 = AbstractC6384F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a8.b(n(jsonReader, new a() { // from class: q4.e
                    @Override // q4.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.D(jsonReader2);
                    }
                }));
            } else if (nextName.equals("orgId")) {
                a8.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.AbstractC0319e F(JsonReader jsonReader) {
        AbstractC6384F.e.AbstractC0319e.a a8 = AbstractC6384F.e.AbstractC0319e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildVersion":
                    a8.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    a8.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    a8.e(jsonReader.nextString());
                    break;
                case "platform":
                    a8.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d.a.c G(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.c.AbstractC0316a a8 = AbstractC6384F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "pid":
                    a8.d(jsonReader.nextInt());
                    break;
                case "processName":
                    a8.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    a8.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F H(JsonReader jsonReader) {
        AbstractC6384F.b b8 = AbstractC6384F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "ndkPayload":
                    b8.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    b8.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    b8.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    b8.b(m(jsonReader));
                    break;
                case "buildVersion":
                    b8.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    b8.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    b8.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    b8.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    b8.g(jsonReader.nextString());
                    break;
                case "platform":
                    b8.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    b8.e(jsonReader.nextString());
                    break;
                case "session":
                    b8.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static AbstractC6384F.e.d.AbstractC0318e.b I(JsonReader jsonReader) {
        AbstractC6384F.e.d.AbstractC0318e.b.a a8 = AbstractC6384F.e.d.AbstractC0318e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("variantId")) {
                a8.c(jsonReader.nextString());
            } else if (nextName.equals("rolloutId")) {
                a8.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e J(JsonReader jsonReader) {
        AbstractC6384F.e.b a8 = AbstractC6384F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "startedAt":
                    a8.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    a8.c(jsonReader.nextString());
                    break;
                case "identifier":
                    a8.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    a8.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    a8.e(q(jsonReader));
                    break;
                case "events":
                    a8.g(n(jsonReader, new a() { // from class: q4.d
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    a8.l(F(jsonReader));
                    break;
                case "app":
                    a8.b(l(jsonReader));
                    break;
                case "user":
                    a8.n(K(jsonReader));
                    break;
                case "generator":
                    a8.h(jsonReader.nextString());
                    break;
                case "crashed":
                    a8.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    a8.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.f K(JsonReader jsonReader) {
        AbstractC6384F.e.f.a a8 = AbstractC6384F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a8.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.a l(JsonReader jsonReader) {
        AbstractC6384F.e.a.AbstractC0304a a8 = AbstractC6384F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "identifier":
                    a8.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    a8.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    a8.c(jsonReader.nextString());
                    break;
                case "version":
                    a8.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    a8.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    a8.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.a m(JsonReader jsonReader) {
        AbstractC6384F.a.b a8 = AbstractC6384F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildIdMappingForArch":
                    a8.b(n(jsonReader, new a() { // from class: q4.a
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    a8.d(jsonReader.nextInt());
                    break;
                case "pss":
                    a8.f(jsonReader.nextLong());
                    break;
                case "rss":
                    a8.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    a8.i(jsonReader.nextLong());
                    break;
                case "processName":
                    a8.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    a8.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    a8.j(jsonReader.nextString());
                    break;
                case "importance":
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static List n(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.a.AbstractC0302a o(JsonReader jsonReader) {
        AbstractC6384F.a.AbstractC0302a.AbstractC0303a a8 = AbstractC6384F.a.AbstractC0302a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "libraryName":
                    a8.d(jsonReader.nextString());
                    break;
                case "arch":
                    a8.b(jsonReader.nextString());
                    break;
                case "buildId":
                    a8.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.c p(JsonReader jsonReader) {
        AbstractC6384F.c.a a8 = AbstractC6384F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a8.b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                a8.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.c q(JsonReader jsonReader) {
        AbstractC6384F.e.c.a a8 = AbstractC6384F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "simulator":
                    a8.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    a8.e(jsonReader.nextString());
                    break;
                case "ram":
                    a8.h(jsonReader.nextLong());
                    break;
                case "arch":
                    a8.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    a8.d(jsonReader.nextLong());
                    break;
                case "cores":
                    a8.c(jsonReader.nextInt());
                    break;
                case "model":
                    a8.f(jsonReader.nextString());
                    break;
                case "state":
                    a8.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    a8.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d r(JsonReader jsonReader) {
        AbstractC6384F.e.d.b a8 = AbstractC6384F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "device":
                    a8.c(u(jsonReader));
                    break;
                case "rollouts":
                    a8.e(A(jsonReader));
                    break;
                case "app":
                    a8.b(s(jsonReader));
                    break;
                case "log":
                    a8.d(y(jsonReader));
                    break;
                case "type":
                    a8.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    a8.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.a s(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.AbstractC0305a a8 = AbstractC6384F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appProcessDetails":
                    a8.b(n(jsonReader, new a() { // from class: q4.c
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    a8.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    a8.f(v(jsonReader));
                    break;
                case "internalKeys":
                    a8.g(n(jsonReader, new a() { // from class: q4.b
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    a8.e(n(jsonReader, new a() { // from class: q4.b
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    a8.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    a8.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d.a.b.AbstractC0306a t(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.AbstractC0306a.AbstractC0307a a8 = AbstractC6384F.e.d.a.b.AbstractC0306a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "name":
                    a8.c(jsonReader.nextString());
                    break;
                case "size":
                    a8.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    a8.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    a8.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.c u(JsonReader jsonReader) {
        AbstractC6384F.e.d.c.a a8 = AbstractC6384F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "batteryLevel":
                    a8.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    a8.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    a8.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    a8.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    a8.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    a8.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.a.b v(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.AbstractC0308b a8 = AbstractC6384F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appExitInfo":
                    a8.b(m(jsonReader));
                    break;
                case "threads":
                    a8.f(n(jsonReader, new a() { // from class: q4.g
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    a8.e(B(jsonReader));
                    break;
                case "binaries":
                    a8.c(n(jsonReader, new a() { // from class: q4.h
                        @Override // q4.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    a8.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.a.b.c w(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.c.AbstractC0309a a8 = AbstractC6384F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a8.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    a8.e(jsonReader.nextString());
                    break;
                case "type":
                    a8.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    a8.b(w(jsonReader));
                    break;
                case "overflowCount":
                    a8.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b x(JsonReader jsonReader) {
        AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a a8 = AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "offset":
                    a8.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    a8.f(jsonReader.nextString());
                    break;
                case "pc":
                    a8.e(jsonReader.nextLong());
                    break;
                case "file":
                    a8.b(jsonReader.nextString());
                    break;
                case "importance":
                    a8.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static AbstractC6384F.e.d.AbstractC0317d y(JsonReader jsonReader) {
        AbstractC6384F.e.d.AbstractC0317d.a a8 = AbstractC6384F.e.d.AbstractC0317d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a8.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC6384F.e.d.AbstractC0318e z(JsonReader jsonReader) {
        AbstractC6384F.e.d.AbstractC0318e.a a8 = AbstractC6384F.e.d.AbstractC0318e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "parameterKey":
                    a8.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    a8.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    a8.d(I(jsonReader));
                    break;
                case "parameterValue":
                    a8.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a8.a();
    }

    public AbstractC6384F L(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC6384F H7 = H(jsonReader);
                jsonReader.close();
                return H7;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String M(AbstractC6384F abstractC6384F) {
        return f42370a.b(abstractC6384F);
    }

    public AbstractC6384F.e.d j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC6384F.e.d r8 = r(jsonReader);
                jsonReader.close();
                return r8;
            } finally {
            }
        } catch (IllegalStateException e8) {
            throw new IOException(e8);
        }
    }

    public String k(AbstractC6384F.e.d dVar) {
        return f42370a.b(dVar);
    }
}
