package com.google.protobuf;

import com.google.protobuf.a;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class g extends com.google.protobuf.a implements Serializable {

    public static abstract class a extends a.AbstractC0243a {

        /* renamed from: o, reason: collision with root package name */
        private d f33100o = d.f33078o;

        protected a() {
        }

        public final d i() {
            return this.f33100o;
        }

        public final a k(d dVar) {
            this.f33100o = dVar;
            return this;
        }
    }

    protected g() {
    }

    protected void g() {
    }

    protected boolean h(e eVar, CodedOutputStream codedOutputStream, f fVar, int i8) {
        return eVar.B(i8, codedOutputStream);
    }

    protected g(a aVar) {
    }
}
