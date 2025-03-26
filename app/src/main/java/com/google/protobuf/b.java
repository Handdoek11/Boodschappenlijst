package com.google.protobuf;

import com.google.protobuf.a;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final f f33072a = f.a();

    private l e(l lVar) {
        if (lVar == null || lVar.c()) {
            return lVar;
        }
        throw f(lVar).a().g(lVar);
    }

    private UninitializedMessageException f(l lVar) {
        return lVar instanceof a ? ((a) lVar).a() : new UninitializedMessageException(lVar);
    }

    @Override // com.google.protobuf.n
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l c(InputStream inputStream) {
        return h(inputStream, f33072a);
    }

    public l h(InputStream inputStream, f fVar) {
        return e(n(inputStream, fVar));
    }

    @Override // com.google.protobuf.n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public l b(InputStream inputStream) {
        return j(inputStream, f33072a);
    }

    public l j(InputStream inputStream, f fVar) {
        return e(o(inputStream, fVar));
    }

    @Override // com.google.protobuf.n
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l a(byte[] bArr) {
        return m(bArr, f33072a);
    }

    public l l(byte[] bArr, int i8, int i9, f fVar) {
        return e(p(bArr, i8, i9, fVar));
    }

    public l m(byte[] bArr, f fVar) {
        return l(bArr, 0, bArr.length, fVar);
    }

    public l n(InputStream inputStream, f fVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return o(new a.AbstractC0243a.C0244a(inputStream, e.t(read, inputStream)), fVar);
        } catch (IOException e8) {
            throw new InvalidProtocolBufferException(e8.getMessage());
        }
    }

    public l o(InputStream inputStream, f fVar) {
        e e8 = e.e(inputStream);
        l lVar = (l) d(e8, fVar);
        try {
            e8.a(0);
            return lVar;
        } catch (InvalidProtocolBufferException e9) {
            throw e9.g(lVar);
        }
    }

    public l p(byte[] bArr, int i8, int i9, f fVar) {
        e f8 = e.f(bArr, i8, i9);
        l lVar = (l) d(f8, fVar);
        try {
            f8.a(0);
            return lVar;
        } catch (InvalidProtocolBufferException e8) {
            throw e8.g(lVar);
        }
    }
}
