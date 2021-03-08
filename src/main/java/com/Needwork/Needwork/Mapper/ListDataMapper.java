package com.Needwork.Needwork.Mapper;

import com.Needwork.Needwork.Model.ListDataModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ListDataMapper {
    void insert(ListDataModel listDataModel);
    ListDataModel select(int id);
    List<ListDataModel> selectAll();
}